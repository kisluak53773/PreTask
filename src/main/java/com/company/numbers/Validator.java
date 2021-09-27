package com.company.numbers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Validator {
    private static final Logger logger= LogManager.getLogger();
    public static float[] validate(String tempString){
        ArrayList<Float> floats=new ArrayList<>();
        String data[]=tempString.split(" ");
        for(String str: data ){
            try {
                floats.add(Float.parseFloat(str));
            }catch (NumberFormatException e){
                logger.error("Wrong string format");
            }
        }
        float []result=new float[floats.size()];
        for(int i=0;i<floats.size();i++){
            result[i]=floats.get(i);
        }
        return result;
    }
}
