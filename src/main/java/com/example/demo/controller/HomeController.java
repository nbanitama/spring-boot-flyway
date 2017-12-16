package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by noba on 12/16/2017.
 */

public interface HomeController {
    @RequestMapping("/")
    public String home(Model model);
}
