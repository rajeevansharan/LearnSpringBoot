package com.Basic.Learn_SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

    public boolean authenticate(String username, String password)
    {
        if(username.equals("Sharan") && password.equals("1234"))
        return true;
        else return false;
    }
}
