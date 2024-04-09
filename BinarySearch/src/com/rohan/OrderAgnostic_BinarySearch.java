package com.rohan;

public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-10,-5,-2,1,5,10,15};
        int target = 15;

        int ans = findTarget(arr , target);
        System.out.println(ans);
        
    }
//    static int findElement(int[] arr , int target) {
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        boolean isAsc = arr[start] < arr[end];
//
//        while (start <= end){
//
//            int mid = start + (end - start)/2;
//
//            if(arr[mid] == target) {
//                return mid;
//            }
//
//            if(isAsc) {
//                if(target > arr[mid]) {
//                    start = mid + 1;
//                }
//                else {
//                    end = mid - 1;
//                }
//            }
//            else {
//                if(target < arr[mid]) {
//                    start = mid + 1;
//                }
//                else {
//                    end = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }

    static int findTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
