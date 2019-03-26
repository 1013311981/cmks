package com.cm.cmks.cmks.controller;

import com.aliyuncs.exceptions.ClientException;
import com.cm.cmks.cmks.DTO.Response;
import com.cm.cmks.cmks.entity.User;

import com.cm.cmks.cmks.service.UserService;
import com.cm.cmks.cmks.until.JwtUtil;
import com.cm.cmks.cmks.until.SmsUtil;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.websocket.api.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;

    /*
     *查询用户信息
     */

    @RequestMapping("/queryUserInfo/{id}")
    public Response<User> queryUserInfo(@PathVariable(value = "id") int id){
        return  userService.queryUserInfo(id);
    }

    @Autowired
    private SmsUtil smsUtil;

    @Value("${aliyun.sms.template_code}")
    private  String template_code;

    @Value("${aliyun.sms.sign_name}")
    private  String sign_name;

    @RequestMapping(value = "/register/{code}",method= RequestMethod.POST)
    public Response register(@PathVariable(value = "code") String code,@RequestBody User user){
        userService.register(code,user);
        return new Response("发送成功");
    }

    /**
     * 发送手机验证码
     * @param mobile
     * @return
     */
    @RequestMapping(value = "/sendsms/{mobile}",method= RequestMethod.POST)
    public Response sendsms(@PathVariable(value = "mobile") String mobile){
        System.out.println(mobile);
        String code = smsUtil.createCode();
        System.out.println(code);
        try {
            smsUtil.sendSms(mobile, template_code, sign_name, "{\"code\":\""+code+"\"}");
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return new Response();
    }

    @Autowired
    private JwtUtil jwtUtil;
    // 登陆
    @RequestMapping(value = "/login",method= RequestMethod.POST)
    public Response login(@RequestBody Map<String,String> map){
        User user =  userService.login(map.get("mobile"),map.get("password"));
        if(user != null){
            //1.签发token
            String token = jwtUtil.createJWT(user.getId()+"", user.getMobile(), "user");
            //2.需要给客户端(token,昵称,头像)
            Map<String,String> resultMap = new HashMap<String, String>();
            resultMap.put("token",token);
//            resultMap.put("nickname",user.getNickname());
//            resultMap.put("avatar",user.getAvatar());

            return new Response(resultMap);
        }else{
            return new Response("登录失败");
        }
    }
}
