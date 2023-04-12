package com.springmysql.springmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmysql.springmysql.model.user;
import com.springmysql.springmysql.service.userService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class index {
    @Autowired
    private userService userService;

    @GetMapping("/")
	public String indexView(ModelMap model, HttpServletRequest request) {
        user new_user = new user();
        new_user.setId(1);
        new_user.setNama("saya");
        new_user.setPasswd("1111");
        new_user.setAlamat("jl aja");
        userService.saveuser(new_user);

		return "index";
	}
    
}
