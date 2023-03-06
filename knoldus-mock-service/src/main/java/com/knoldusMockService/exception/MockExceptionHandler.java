package com.knoldusMockService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class MockExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExcpetion(Exception exception, WebRequest request){
        return new ResponseEntity<>("Exception Occured !!", HttpStatus.BAD_REQUEST);

    }
}
