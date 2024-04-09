package com.rohan;

public class Celing_Number {
    //Sorted Array
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};

        int ans = Ceiling(arr, 13);
        System.out.println(ans);
    }
    static int Ceiling(int[] arr , int target) {

        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]){
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
