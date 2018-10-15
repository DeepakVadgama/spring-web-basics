package com.shop.toys.web;

import com.google.common.collect.Lists;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    List<String> times = Lists.newArrayList("evening", "morning");
    
    @GetMapping("/greeting")
    public ResponseEntity<String> greet(@RequestParam String name,
                                        @RequestParam String time) {

        if (!times.contains(time)) {
            return ResponseEntity.badRequest().body("Time should be morning/evening"); 
        }

        return ResponseEntity.ok("Good " + time + ", " + name);
    }
}
