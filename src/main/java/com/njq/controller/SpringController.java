package com.njq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by NIJIAQI on 2017/9/30.
 */
@Controller
@RequestMapping(value="/hello", method = GET)
public class SpringController {
    @RequestMapping(value="/hello", method = GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}
