package com.Basic.Learn_SpringBoot;

import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@ToString
public class TodoService {

    private static  List<Todo> todo = new ArrayList<>();

        static
        {
            todo.add(new Todo(1L,"Sharan","Learn Spring Boot",false,null));
            todo.add(new Todo(2L,"Sharan","Learn Spring MVC",false,null));
        }


        public List<Todo> findByUsername(String username)
        {
            List<Todo> todoList = new ArrayList<>();
           for(Todo t : todo)
           {
               if(t.getUsername().equals(username))
               {
                 todoList.add(t);

               }
           }

            return todoList;
        }
}
