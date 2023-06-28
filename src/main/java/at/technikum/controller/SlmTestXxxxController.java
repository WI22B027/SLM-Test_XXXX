package at.technikum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmTestXxxxController {

    @RequestMapping("/")
    public static String name(){

        return "Controller";
    }

}
