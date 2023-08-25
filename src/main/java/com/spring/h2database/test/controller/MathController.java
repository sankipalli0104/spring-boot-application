package com.spring.h2database.test.controller;

import com.spring.h2database.test.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/addTwoNUmbers/{num1}/{num2}")
    public int addTwoNumbers(@PathVariable("num1") int num1, @PathVariable("num2") int num2){
        return mathService.calculateSum(num1, num2);
    }


}
