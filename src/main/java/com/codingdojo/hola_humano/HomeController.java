package com.codingdojo.hola_humano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required = false) String name, @RequestParam(value="lastname", required = false) String lastName, @RequestParam(value="times", required = false) int times) {
        if ((name == null) || (lastName == null)) {
            name = "human";
            lastName = "";
        }

        return "Hello " + name + " " + lastName;
    }
}

