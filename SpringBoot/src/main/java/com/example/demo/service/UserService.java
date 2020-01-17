package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.iservice.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author "LiXunXun"
 * @date 2020/1/14 0014
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 查询人员是否存在
     *
     * @param user
     * @return java.util.List<com.example.demo.entity.User>
     * @author "LiXunXun"
     * @date 2020年01月14日
     */
    @Override
    public User queryUserByNo(User user) {
        return userMapper.queryUserByNo(user.getUserName(), user.getPassWord());
    }
}
