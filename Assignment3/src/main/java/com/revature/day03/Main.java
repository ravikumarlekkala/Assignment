package com.revature.day03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        compare c=new compare();

        int a= sc.nextInt();
        int b = sc.nextInt();
        int e= sc.nextInt();

        c.greater(a,b,e);

    }
}
