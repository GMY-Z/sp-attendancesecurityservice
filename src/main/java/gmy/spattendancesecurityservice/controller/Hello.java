package gmy.spattendancesecurityservice.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @authon GMY
 * @create 2020-11-16 15:26
 */

@RestController
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
