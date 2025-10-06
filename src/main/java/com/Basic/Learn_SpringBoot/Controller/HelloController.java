package com.Basic.Learn_SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello()
    {
        return "Hello Sharan";
    }

    @GetMapping("/leaf")
    public String leaf( @RequestParam(defaultValue = "Sharan")String name , Model model)
    {
        model.addAttribute("name",name);
        return "Leaf";
    }


}

