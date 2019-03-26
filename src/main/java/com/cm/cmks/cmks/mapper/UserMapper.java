package com.cm.cmks.cmks.mapper;


import com.cm.cmks.cmks.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

   UserInfo queryUserInfo(long id);
}
