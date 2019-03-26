package com.cm.cmks.cmks.service;

import com.cm.cmks.cmks.DTO.Response;
import com.cm.cmks.cmks.entity.UserInfo;
import com.cm.cmks.cmks.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Response<UserInfo> queryUserInfo(long id) {
        UserInfo userInfo = userMapper.queryUserInfo(id);

        return new Response(userInfo);

    }
}
