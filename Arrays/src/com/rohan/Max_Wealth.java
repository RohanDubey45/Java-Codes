package com.rohan;

public class Max_Wealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {14,5,6},
                {7,8,9}
        };
        int ans = max_wealth(arr);
        System.out.println(ans);
    }
    static int max_wealth(int[][] arr) {
        int max = 0;
        for (int rows = 0; rows< arr.length; rows++) {
            int Sum = 0;
            for (int cols = 0; cols < arr[rows].length; cols++) {
                Sum = Sum + arr[rows][cols];
            }
            if(Sum > max){
                max = Sum;
            }
        }
        return max;

    }

}
