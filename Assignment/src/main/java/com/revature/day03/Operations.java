package com.revature.day03;

public class Operations {
    public void add(double x, double y){
        double a= x+y;
        System.out.println("Addition: " + a);
    }

    public void sub(double x, double y){
        double b= x-y;
        System.out.println("Subtraction: " + b);
    }
    public void mul(double x, double y){
        double c= x*y;
        System.out.println("Multiplication: " + c);
    }
    public void div(double x, double y){
        double d= x/y;
        System.out.println("Division: " + d);
    }

    public static void main(String[] args){
        Operations p=new Operations();

        double q=21;
        double w=7;

        p.add(q,w);
        p.sub(q,w);
        p.mul(q,w);
        p.div(q,w);
    }
}
