package com.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lenovo on 2017/7/30.
 */
@Controller
@SpringBootApplication
public class SimpleHellowWorld
{
    @ResponseBody
    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleHellowWorld.class, args);
    }
}