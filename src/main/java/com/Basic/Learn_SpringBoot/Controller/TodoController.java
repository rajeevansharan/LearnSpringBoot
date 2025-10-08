package com.Basic.Learn_SpringBoot.Controller;

import com.Basic.Learn_SpringBoot.Entity.Todo;
import com.Basic.Learn_SpringBoot.TodoService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class TodoController {

    @Autowired
    private TodoService todoService;


    @GetMapping("/todos/{username}")
    public String getTodos(@PathVariable String username , @SessionAttribute("name") String name, Model model)
    {
        List<Todo> todo = todoService.findByUsername(username);
         model.addAttribute("todos",todo);
        model.addAttribute("name", name);

        return "Todo";
    }

    @GetMapping("/addTodoForm")
    public String addTodo()
    {
        return "AddTodo";
    }

    @PostMapping("/addTodo")
    public String addTodoData(@RequestParam long id,@RequestParam String username,@RequestParam String description)
    {
        Todo todo = new Todo(id,username,description,true,null);
        todoService.save(todo);
        return "redirect:/todos/" + username;
    }

}