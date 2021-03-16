package com.biriba.singlewebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleController {

    @RequestMapping("/")
    public String index(){
        return "Hello Word!\n";
    }
    
}
