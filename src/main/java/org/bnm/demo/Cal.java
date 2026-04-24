package org.bnm.demo;

public class Cal {
    public int add (int a , int b){
        return a+b;
    }
    public int sub (int a , int b){
        return a-b;
    }
    public int mul (int a , int b){
        return a*b;
    }
    public int div (int a , int b){
        if(b==0){
            throw new ArithmeticException("Can not divide by zero");
        }
        return a/b;
    }
}
