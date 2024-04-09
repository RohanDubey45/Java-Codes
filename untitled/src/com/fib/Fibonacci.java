package com.fib;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;

        System.out.print(firstTerm + " ");
        System.out.print(secondTerm + " ");

        for(int i = 2; i<n; i++){

            nextTerm = firstTerm + secondTerm;

            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
