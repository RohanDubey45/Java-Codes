package com.rohan;

import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {11,22,39},
                {77,8,90},
                {11,12,13}
        };
//        int[] ans = search_2d(arr, 12);
//        System.out.println(Arrays.toString(ans));

//        int max = Max(arr);
//        System.out.println(max);

        int min = min(arr);
        System.out.println(min);
    }
    static int[] search_2d(int[][] arr , int target){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols] == target){
                    return new int[]{rows,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] > max){
                    max = arr[rows][cols];
                }
            }
        }
        return max;
    }
    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] < min){
                    min = arr[rows][cols];
                }
            }
        }
        return min;
    }
}

