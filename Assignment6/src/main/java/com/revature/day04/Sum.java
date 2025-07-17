package com.revature.day04;

public class Sum {
    public static int add(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+add(n-1);
        }
    }
}
