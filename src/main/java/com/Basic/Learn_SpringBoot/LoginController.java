package com.Basic.Learn_SpringBoot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login(@RequestParam String name ,  Model model)
    {
        model.addAttribute("name",name);
        return "Login";
    }

}
