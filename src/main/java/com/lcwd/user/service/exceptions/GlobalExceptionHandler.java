package com.lcwd.user.service.exceptions;

import com.lcwd.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerNotFoundException(ResourceNotFoundException ex){
        String message=ex.getMessage();
        ApiResponse response=ApiResponse.builder().success(false)
                .status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }
}
