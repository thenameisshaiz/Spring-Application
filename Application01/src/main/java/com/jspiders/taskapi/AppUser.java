package com.jspiders.taskapi;

import lombok.Data;

@Data
public class AppUser {
    private Long id;
    private String name;
    private String mobile;
    private String password;
}
