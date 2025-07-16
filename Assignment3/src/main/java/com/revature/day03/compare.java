package com.revature.day03;

public class compare {
    public void greater(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a + "is greater");
        }
        else if(b>a && b>c){
            System.out.println(b + "is greater");
        }
        else{
            System.out.println(c + "is greater");
        }
    }
}
