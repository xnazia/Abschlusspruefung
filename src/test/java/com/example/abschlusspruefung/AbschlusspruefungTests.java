package com.example.abschlusspruefung;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbschlusspruefungTests {

    Abschlusspruefung test = new Abschlusspruefung();

    @Test
    void InchTest1(){
        double a = 6;
        double result = 15.24;
        double expectedResult = test.inches(a);
        assertEquals(result,expectedResult);
    }


    @Test
    void YardTests1(){
        double a = 1;
        double result = 0.91444;
        double expectedResult = test.yards(a);
        assertEquals(result,expectedResult);
    }

}
