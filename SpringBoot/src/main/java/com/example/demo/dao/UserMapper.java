package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author "LiXunXun"
 * @date 2020/1/14 0014
 */
public interface UserMapper {

    User queryUserByNo(@Param("userName") String userName, @Param("passWord") String passWord);
}
