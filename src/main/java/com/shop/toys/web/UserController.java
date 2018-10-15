package com.shop.toys.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/request-header")
    public String language(@RequestHeader(value = "token") String token) {
        return token;
    }
    
    @GetMapping("/user/{id}/name")
    public String name(@PathVariable(value = "id") int userId,
                       @RequestHeader(value = "Accept-Language") String language) {
        
        logger.info("Request language is " + language);
        return getUserName(userId);
    }

    @GetMapping("/{id}/age")
    public int age(@PathVariable(value = "id") int userId) {
        return getUserAge(userId);
    }

    private int getUserAge(int userId) {
        return 33;
    }

    private String getUserName(int userId) {
        return "Jackie";
    }
}
