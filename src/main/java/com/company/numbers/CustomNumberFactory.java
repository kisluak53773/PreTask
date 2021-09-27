package com.company.numbers;

public class CustomNumberFactory {
    public  static CustomNumber CreateCustomNumber(float num){
        return new CustomNumber(num);
    }
}
