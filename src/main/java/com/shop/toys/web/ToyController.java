package com.shop.toys.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class ToyController {
    
    @GetMapping("/toy/elephant")
    public Toy elephant() {
        return new Toy("eli", "medium", "gray");
    }
    
    @PostMapping("/toy/add")
    public void addToy(@RequestBody Toy newToy){
        addToDatabase(newToy);
    }

    private void addToDatabase(Toy newToy) {
        
    }
}
    