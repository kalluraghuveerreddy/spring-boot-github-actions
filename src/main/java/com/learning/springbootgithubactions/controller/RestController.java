package com.learning.springbootgithubactions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {

    @GetMapping
    public ResponseEntity<String> defaultResponse() {
        return ResponseEntity.ok("Practicing Github Actions");
    }
}
