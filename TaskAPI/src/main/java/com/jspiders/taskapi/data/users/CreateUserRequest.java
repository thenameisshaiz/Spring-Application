package com.jspiders.taskapi.data.users;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String name;
    private String email;
    private String mobile;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
