package com.rohan;

public class Max_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 45, 5};

//        To find the max of array
        Max(arr);

//        To find the elment in certain range of array
//        MaxRange(arr,0,2);
    }
//    Range of array
//    static void MaxRange(int[] arr , int start , int end){
//        int max = 0;
//        for (int i = start; i <=end; i++) {
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }

    static void Max(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
