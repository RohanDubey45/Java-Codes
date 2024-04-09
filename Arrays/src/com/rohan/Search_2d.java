package com.rohan;

import java.util.Arrays;

public class Search_2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,222,3},
                {4,55,6},
                {7,8,9}
        };
//        int[] ans = FindElement(arr,6);
//        System.out.println(Arrays.toString(ans));

        int ans2 = max(arr);
        System.out.println(ans2);

    }
//    static int[] FindElement(int[][] arr, int target){
//        for (int rows = 0; rows < arr.length; rows++) {
//            for (int cols = 0; cols < arr[rows].length; cols++) {
//                if(arr[rows][cols] == target){
//                    return new int[]{rows,cols};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++){
                if(arr[rows][cols]>max){
                    max = arr[rows][cols];
                }
            }
        }
        return max;
    }

}

