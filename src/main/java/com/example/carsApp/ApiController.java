package com.example.carsApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ApiController {

    ArrayList<String> list = new ArrayList<>();


    @GetMapping("/cars")
    public ArrayList<String> carsFun() {
        return list;
    }

    @PostMapping("/addCars")
    public void addCars(
            @RequestParam
                    String name) {
        list.add(name);
    }
}
