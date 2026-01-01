package com.jspiders.taskapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    @PostMapping
    public void createTask(@RequestBody TaskRequest taskRequest){
        System.out.println("Creating Task...");
        System.out.println(taskRequest.getTaskID());
        System.out.println(taskRequest.getTaskTitle());
        System.out.println(taskRequest.getTaskDesc());
    }
}
