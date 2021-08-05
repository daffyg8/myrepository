package com.example.honmework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {
        if (StringUtils.hasLength(username) && "123456".equals(password)) {
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }

    }
}
