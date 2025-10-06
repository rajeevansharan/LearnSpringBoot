package com.Basic.Learn_SpringBoot.Controller;


import com.Basic.Learn_SpringBoot.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("name")
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
    public String login(@RequestParam String username,@RequestParam String password,@RequestParam String nickname, Model model)
    {
        if(authenticationService.authenticate(username,password))
        {

            model.addAttribute("username",username);
            model.addAttribute("password",password);
            model.addAttribute("name",nickname);
            return "Welcome";
        }
       else return "Login";
    }


}
