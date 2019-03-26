package com.cm.cmks.cmks.controller;

import com.cm.cmks.cmks.DTO.Response;
import com.cm.cmks.cmks.entity.UserInfo;
import com.cm.cmks.cmks.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;

    /*
     *查询用户信息
     */

    @RequestMapping("/queryUserInfo")
    public Response<UserInfo> queryUserInfo(long id){
        return  userService.queryUserInfo(id);
    }

}
