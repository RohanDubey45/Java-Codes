package com.rohan;

public class Split_Array_Sum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        int ans = split_array_sum(arr,m);
        System.out.println(ans);
    }
    static int split_array_sum(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end = end + arr[i];
        }
        while (start < end) {
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start)/2;
           for(int num : arr){
               if(sum + num > mid){
                   sum = num;
                   pieces++;
               }
               else {
                   sum = sum + num;
               }
           }
           if(pieces > m){
               start = mid + 1;
           }
           else {
               end = mid;
           }
        }
        return start;
    }
}
