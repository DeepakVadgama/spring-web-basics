package com.shop.toys.web;

import com.google.common.collect.Lists;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController2 {

    @GetMapping("/secret-greeting")
    public ResponseEntity<String> greet(@RequestParam String name,
                                        @RequestParam String secret) {

        if (!"abc123".equals(secret)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Not authorized"); 
        }

        return ResponseEntity.ok("Welcome to the toy land, " + name); 
    }
}
