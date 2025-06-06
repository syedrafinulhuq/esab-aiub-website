package com.esab.aiub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {

    @GetMapping("/data")
    public List<String> getData() {
        return List.of("Apple", "Banana", "Cherry");
    }
}
