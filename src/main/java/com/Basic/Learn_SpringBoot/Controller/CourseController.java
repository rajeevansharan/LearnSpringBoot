package com.Basic.Learn_SpringBoot.Controller;

import com.Basic.Learn_SpringBoot.Entity.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public Course getCourse()
    {
        return new Course(1L,"Java","<NAME>");
    }



}
