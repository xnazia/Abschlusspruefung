package com.example.abschlusspruefung;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Abschlusspruefung {


    //--feature inches to centimeters
    public double inches( double a){
        return a*2.54;
    }



    //--feature yards to meters
    public double yards (double a){
        return a*0.91444;
    }



}
