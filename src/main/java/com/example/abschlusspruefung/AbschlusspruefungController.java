package com.example.abschlusspruefung;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AbschlusspruefungController {

    @RequestMapping("/inches")
    //--feature inches to centimeters
    public double inches(@RequestParam double a){
        return a*2.54;
    }


    @RequestMapping("/yards")
    //--feature yards to meters
    public double yards (@RequestParam double a){
        return a*0.91444;
    }




}
