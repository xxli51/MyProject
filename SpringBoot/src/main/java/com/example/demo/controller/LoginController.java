package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.iservice.IUserService;
import com.example.demo.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author "LiXunXun"
 * @date 2020/1/14 0014
 */
@Controller
public class LoginController {

    @Resource
    private IUserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser, HttpSession session) {
        String userName = requestUser.getUserName();
        userName = HtmlUtils.htmlEscape(userName);
        requestUser.setUserName(userName);
        requestUser = userService.queryUserByNo(requestUser);
        if (null == requestUser) {
            return new Result(400, null, "error");
        } else {
            session.setAttribute("user", requestUser);
            return new Result(200, null, "success");
        }
    }

}
