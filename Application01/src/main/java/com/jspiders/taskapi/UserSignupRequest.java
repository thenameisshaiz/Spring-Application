package com.jspiders.taskapi;

import lombok.Data;

@Data
public class UserSignupRequest {
    private String name;
    private String phone;
    private String password;
}
