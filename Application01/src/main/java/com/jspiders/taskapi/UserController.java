package com.jspiders.taskapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

//    Using @PathVariable
    @GetMapping("/{id}")
    public void getUserById(@PathVariable Long id){
        System.out.println("This is getUserById()");
        System.out.println("User ID: "+id);
    }

//    Using @RequestParam
    @GetMapping
    public void getUserByNameAndMobile(@RequestParam String name,@RequestParam String mobile){
        System.out.println("This is getUserByNameAndMobile()");
        System.out.println("UserName: "+name);
        System.out.println("User Mobile: "+mobile);
    }

//   using @RequestHeader
//    @GetMapping
//    public void getUserByNameAndMobileBody(@RequestHeader String name, @RequestHeader String mobile){
//        System.out.println("This is getUserByNameAndPhonebyRequestHeader()");
//        System.out.println("UserName: "+name);
//        System.out.println("User Mobile: "+mobile);
//    }

//    using @RequestBody
    @PostMapping
    public void createUser(@RequestBody UserSignupRequest userSignupRequest){
        System.out.println("This is createUser()");
        System.out.println(userSignupRequest.getName());
        System.out.println(userSignupRequest.getPhone());
        System.out.println(userSignupRequest.getPassword());
    }
}
