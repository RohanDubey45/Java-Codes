package com.Test;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,2,1};
        int ans = peak(arr);
        System.out.println(ans);
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end -start)/2;
            if (arr[mid] > arr[mid + 1]){
                // this means we are in the decreasing part of the array
                // this may be the possible answer
                // but we will still check in the left part
                end = mid;
            }
            else {
                // here arr[mid] < arr[mid + 1] so we will start the start value with start = mid+1
                //in the end both the start and end will point to the maximum element in the array
//                you can return start or end as it is pointing to same element that is the max element
                start = mid + 1;
            }
        }
        return start;
    }
}
