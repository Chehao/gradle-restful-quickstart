package com.quickstart.controller;

import com.quickstart.exception.ErrorDetails;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ErrorDetails error() {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), "Error handling",
                "", HttpStatus.NOT_FOUND);
        return errorDetails;
    }

    @GetMapping("/hello")
    public String helloError() throws Exception{
        throw new Exception("not found test");
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}