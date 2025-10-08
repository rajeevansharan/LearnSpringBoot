package com.Basic.Learn_SpringBoot.Controller;

import com.Basic.Learn_SpringBoot.Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LearnController {


    @GetMapping("/ShowForm")
    public String showForm()
    {

        return "learn";
    }

    @PostMapping("/learnModel")
    public String learnModel(@ModelAttribute Student student, RedirectAttributes redirectAttributes)
    {
           redirectAttributes.addFlashAttribute("student",student);
        return "redirect:/formInfo";
    }

    @GetMapping("formInfo")
    public String showInfo()
    {

        return "FormInfo";
    }

}



