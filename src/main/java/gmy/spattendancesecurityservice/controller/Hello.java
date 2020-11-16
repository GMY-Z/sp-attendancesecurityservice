package gmy.spattendancesecurityservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @authon GMY
 * @create 2020-11-16 15:26
 */

@Controller
public class Hello {

    @GetMapping("/hello")
    public String hello() {
        return "daf";
    }

}
