package org.learn.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mvc")
public class MyFirstMvc {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model){
        model.addAttribute("message","Our greetings from the MVC Application");
        return "mvc-view-template";
    }

}
