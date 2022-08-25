package ru.msaggik.spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Value("${hello}") // внедрение ключ(hello)=значение(Hello world) в поле hello из application.properties
    private String hello;

    @GetMapping("/hello")
    public String hello() {
        System.out.println(this.hello);

        return "hello";
    }
}
