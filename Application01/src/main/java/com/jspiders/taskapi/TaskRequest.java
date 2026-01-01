package com.jspiders.taskapi;

import lombok.Data;

@Data
public class TaskRequest {
    private int taskID;
    private String taskTitle;
    private String taskDesc;
}
