package at.technikum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmTestXxxxController {

    @RequestMapping("/api/factorial")
    public static int getFactorial(@RequestParam int factorial){
        int fact = 1;
        for (int i = 2; i <= factorial; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
