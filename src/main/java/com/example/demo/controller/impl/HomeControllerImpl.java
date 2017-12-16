package com.example.demo.controller.impl;

import com.example.demo.controller.HomeController;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created by noba on 12/16/2017.
 */
@Controller
public class HomeControllerImpl implements HomeController {

    @Autowired
    private UserService userService;

    @Override
    public String home(Model model) {
        model.addAttribute("users", userService.findAll());
        return "index";
    }
}
