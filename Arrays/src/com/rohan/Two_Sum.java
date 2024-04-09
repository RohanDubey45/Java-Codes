package com.rohan;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        CheckSum(arr , 6);
    }
    static void CheckSum(int[] arr , int target){
        for(int i = 0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if( arr[i] + arr[j] == target ){
                    System.out.println(arr[i] + "," + arr[j]);
                    break;
                }
            }
        }
    }
}
