package com.restaurant.ex06.exception;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handle(Exception ex) {
        return "ID đơn hàng phải là một số";
    }
}