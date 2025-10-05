package com.Basic.Learn_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos/{username}")
    public String getTodos(@PathVariable String username , Model model)
    {
        List<Todo> todo = todoService.findByUsername(username);
         model.addAttribute("todos",todo);

        return "Todo";
    }
}