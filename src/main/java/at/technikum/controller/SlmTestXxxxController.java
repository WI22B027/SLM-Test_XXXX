package at.technikum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmTestXxxxController {

    public int save = 0;

    @RequestMapping("/api/factorial")
    public int getFactorial(@RequestParam int number){
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        save += fact;
        return fact;
    }

    @RequestMapping("/api/total")
    public int returnTotal(){
        return save;
    }
}
