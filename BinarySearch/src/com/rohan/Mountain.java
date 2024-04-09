package com.rohan;

public class Mountain {
    public static void main(String[] args) {
//        peak element and peak index same soln for index return end or start
        int[] arr = {2, 7, 8, 3, 2, 1};

        int peak = searchMountainPeak(arr);
        System.out.println(peak);


//        To find the target element in the mountain array
//        int target = 8;
//        int ans = search(arr,target);
//        System.out.println(ans);

    }
    static int search(int[] arr, int target){
        int peak = searchMountainPeak(arr);
        int firstTry = findElement(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        return findElement(arr, target, peak+1, arr.length-1);
    }
    static int findElement(int[] arr , int target, int start , int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start)/2;


            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int searchMountainPeak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                // it states that we are in the decreasing part
                end = mid;
            }
            else {
                // it states that we are in the increasing part means arr[mid+1] > arr[mid]
                start = mid + 1;
            }
        }
        return end;
    }
}
