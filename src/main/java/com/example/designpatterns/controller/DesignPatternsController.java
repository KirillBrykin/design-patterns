package com.example.designpatterns.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/design-patterns")
public class DesignPatternsController {

    @GetMapping
    public void test() {
        log.info("DesignPatternsController.test");
    }
}