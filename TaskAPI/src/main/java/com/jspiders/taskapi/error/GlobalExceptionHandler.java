package com.jspiders.taskapi.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> arthimeticExceptionHandler(ArithmeticException ex){
        System.out.println("Handling ArthimeticException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong");
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> nullPointerExceptionHandler(NullPointerException exp){
        System.out.println("Handling NullPointerException");
        exp.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong");
    }

    @ExceptionHandler(InvalidNameException.class)
    public ResponseEntity<String> invalidNameExceptionHandler(InvalidNameException ex){
        System.out.println("Handling InvalidArgumentException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(InvalidMobileException.class)
    public ResponseEntity<String> invalidMobileExceptionHandler(InvalidMobileException ex){
        System.out.println("Handling InvalidArgumentException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(InvalidEmailException.class)
    public ResponseEntity<String> invalidEmailExceptionHandler(InvalidEmailException ex){
        System.out.println("Handling InvalidArgumentException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(InvalidPasswordException.class)
    public ResponseEntity<String> invalidPasswordExceptionHandler(InvalidPasswordException ex){
        System.out.println("Handling InvalidArgumentException");
        ex.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

}
