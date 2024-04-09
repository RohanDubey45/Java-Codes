package com.rohan;

public class Max_Min {
    public static void main(String[] args) {

//      In 1d array
        int[] arr = {11,22,3,44,501,6};

        int min = findMin(arr);
        System.out.println(min);

        int max = findMax(arr);
        System.out.println(max);

    }
    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
