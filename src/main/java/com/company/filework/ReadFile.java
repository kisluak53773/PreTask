package com.company.filework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadFile {
    private final static Logger logger=LogManager.getLogger();
    public static String read(){
        String str ="";
        String check;
        try(FileReader reader=new FileReader("Data/info.txt");
            BufferedReader bufferedReader=new BufferedReader(reader)){
            while ((check=bufferedReader.readLine())!=null){
                str+=check;
                str+=" ";
            }
        } catch (FileNotFoundException e) {
            logger.error("File not found");
        } catch (IOException e) {
            logger.error("IOException");
        }
        return str;
    }
}
