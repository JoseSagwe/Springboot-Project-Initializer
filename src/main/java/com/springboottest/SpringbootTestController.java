package com.springboottest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootTestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Developer Joseph";
    }

    @RequestMapping("/bye")
        public String bye(){
            return "Goodbye Developer Joseph";
        }
    }

