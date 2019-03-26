package com.cm.cmks.cmks.service;

import com.cm.cmks.cmks.DTO.Response;
import com.cm.cmks.cmks.entity.User;

import com.cm.cmks.cmks.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Response<User> queryUserInfo(int id) {
        User userInfo = userMapper.queryUserInfo(id);

        return new Response(userInfo);

    }

    public void register(String code, User user) {
        //1.校验验证码
	/*	String redisCode = (String) redisTemplate.opsForValue().get("smscode_"+user.getMobile());
		if(redisCode == null){
			throw new RuntimeException("请点击获取验证码");
		}
		if(!redisCode.equals(code)){
			throw new RuntimeException("验证码校验失败");
		}*/
        //2.密码加密

        //3. user信息补全(id,关注,粉丝数...)

        //4.调用Dao
        userMapper.save(user);
    }

    public User login(String mobile, String password) {
        return null;
    }
}
