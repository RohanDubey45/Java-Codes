package com.rohan;

public class Max_Wealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {42,5,6},
                {7,8,9}
        };
        int ans = findwealth(arr);
        System.out.println(ans);
    }
    static int findwealth(int[][] arr) {
        int max = 0;
        for (int rows = 0; rows < arr.length; rows++) {
            int sum = 0;
            for (int cols = 0; cols < arr[rows].length; cols++) {
                sum += arr[rows][cols];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

}
