package com.rohan;

public class Floor_Number {
    public static void main(String[] args) {
        //Sorted Array
        int[] arr = {2,4,6,8,10};
        int ans = Floor(arr , 10);
        System.out.println(ans);
    }
    static int Floor(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }

}
