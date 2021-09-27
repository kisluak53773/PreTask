package com.company.numbers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Multiplication {
    private static final Logger logger= LogManager.getLogger();
    public static float multiply(float a,float b){
        float c = 0;
        try {
            c=a*b;
        }catch (ArithmeticException e){
            logger.error("One number is zero");
        }finally {
            return c;
        }
    }
}
