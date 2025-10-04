package com.Basic.Learn_SpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private AuthenticationService authenticationService;


    @GetMapping("/login")
    public String login( )
    {
        return "Login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,@RequestParam String password, Model model)
    {
        if(authenticationService.authenticate(username,password))
        {

            model.addAttribute("username",username);
            model.addAttribute("password",password);
            return "Welcome";
        }
       else return "Login";
    }


}
