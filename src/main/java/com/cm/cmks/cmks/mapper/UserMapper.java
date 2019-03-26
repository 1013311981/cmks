package com.cm.cmks.cmks.mapper;


import com.cm.cmks.cmks.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

   User queryUserInfo(int id);

   void save(User user);
}
