package com.jspiders.taskapi.services.Impl;

import com.jspiders.taskapi.data.users.AppUser;
import com.jspiders.taskapi.data.users.CreateUserRequest;
import com.jspiders.taskapi.error.InvalidNameException;
import com.jspiders.taskapi.error.InvalidNameException;
import com.jspiders.taskapi.services.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class AppUserServiceImpl implements AppUserService
{
    @Override
    public ResponseEntity<String> createUser(CreateUserRequest createUserRequest)
    {
        System.out.println("this is AppUserServiceImpl --> createUser()");

        System.out.println("name : "+createUserRequest.getClass().getName());

        //validate
        validateName(createUserRequest);
        validateEmail(createUserRequest);
        validateMobile(createUserRequest);
        validatePassword(createUserRequest);
        //logics

        //save data to database


//        ResponseEntity<String> response = ResponseEntity.ok("User created ");
//        return response;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("User created");
    }

    @Override
    public ResponseEntity<String> updateUser() {
        System.out.println("this is AppUserServiceImpl --> updateUser()");

        //logics
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("User updated");
    }

    @Override
    public ResponseEntity<String> deleteUser(String email, String mobile, String password)
    {
        System.out.println("this is AppUserServiceImpl --> deleteUser()");

        //logics
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("User deleted");
    }

    @Override
    public ResponseEntity<List<AppUser>> getAllUsers()
    {
        System.out.println("this is AppUserServiceImpl --> getAllUsers()");

        //logics
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @Override
    public ResponseEntity<AppUser> getUserById(Long userId)
    {
        System.out.println("this is AppUserServiceImpl --> getUserById()");

        //logics

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    private void validateName(CreateUserRequest createUserRequest)
    {
        //Validation
        if(createUserRequest.getName() != null &&
                createUserRequest.getName().length()<3)
        {
//            IllegalArgumentException ex = new IllegalArgumentException();
//            throw ex;

            InvalidNameException ex = new InvalidNameException("Invalid Name");
            throw ex;
        }
    }

    private void validateEmail(CreateUserRequest createUserRequest)
    {
        //Validation
        if(createUserRequest.getEmail() != null && createUserRequest.getEmail().length()<8)
        {
//            IllegalArgumentException ex = new IllegalArgumentException();
//            throw ex;

            InvalidNameException ex = new InvalidNameException("Invalid Email");
            throw ex;
        }
    }

    private void validateMobile(CreateUserRequest createUserRequest)
    {
        //Validation
        if(createUserRequest.getMobile() != null &&
                createUserRequest.getMobile().length()<10)
        {
//            IllegalArgumentException ex = new IllegalArgumentException();
//            throw ex;

            InvalidNameException ex = new InvalidNameException("Invalid Mobile");
            throw ex;
        }
    }

    private void validatePassword(CreateUserRequest createUserRequest)
    {
        //Validation
        if(createUserRequest.getPassword() != null &&
                createUserRequest.getPassword().length()<8)
        {
//            IllegalArgumentException ex = new IllegalArgumentException();
//            throw ex;

            InvalidNameException ex = new InvalidNameException("Enter Password of minimum 8 character");
            throw ex;
        }
    }
}
