package com.company.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import  com.company.numbers.*;
import com.company.filework.*;

import java.util.ArrayList;

public class Main {
    private static final Logger logger= LogManager.getLogger();
    public static void main(String[] args) {
        String tempString=ReadFile.read();
        float []floats=Validator.validate(tempString);
        ArrayList<CustomNumber> customNumbers=new ArrayList<>();
        for(Float num:floats){
            customNumbers.add(CustomNumberFactory.CreateCustomNumber(num));
        }
        for(int i=0;i<customNumbers.size()-1;i++){
            logger.info("Numbers: "+customNumbers.get(i).getaFloat()+","+
                    customNumbers.get(i+1).getaFloat());
            logger.info("Sum: "+Summ.sum(customNumbers.get(i).getaFloat(),customNumbers.get(i+1).getaFloat()));
            logger.info("Subtraction: "+Subtraction.subtract(customNumbers.get(i).getaFloat(),customNumbers.get(i+1).getaFloat()));
            logger.info("Multiplication: "+Multiplication.multiply(customNumbers.get(i).getaFloat(),customNumbers.get(i+1).getaFloat()));
            logger.info("Division: "+Division.divide(customNumbers.get(i).getaFloat(),customNumbers.get(i+1).getaFloat()));
        }
    }
}
