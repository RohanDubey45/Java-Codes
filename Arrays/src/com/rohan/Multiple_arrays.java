package com.rohan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Multiple_arrays {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//
////        Taking input of the each row and column we use two loops that is row and col
//        for(int row = 0; row < arr.length; row++){
//            for(int col = 0; col < arr[row].length; col++){
//                arr[row][col] = in.nextInt();
//            }
//        }

//        for printing the 2d array there are 3 methods
//        for(int row = 0; row < arr.length; row++){
//            for(int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
//
//        for(int[] num : arr){
//            System.out.println(Arrays.toString(num));
//        }

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        System.out.println(list);
    }
}
