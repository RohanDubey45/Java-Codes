package com.Test;

public class Test {
    public static void main(String[] args) {
//        int[] arr = {14,12,10,8,6};
        int[] arr = {-5,-2,6,8,9};
        int target = 9;

//        int ans = findTarget(arr,target);
//        int ans = findRevTarget(arr,target);
        int ans = OrderAgnostic(arr,target);
        System.out.println(ans);
    }
//    static int findTarget(int[] arr, int target){
//        int s = 0;
//        int e = arr.length - 1;
//        while (s <= e) {
//            int m = s + (e - s)/2;
//            if(target < arr[m]){
//                e = m - 1;
//            }
//            else if (target > arr[m]) {
//                s = m + 1;
//            }
//            else {
//                return m;
//            }
//        }
//        return -1;
//    }
//static int findRevTarget(int[] arr, int target){
//        int s = 0;
//        int e = arr.length - 1;
//        while (s <= e) {
//            int m = s + (e - s)/2;
//           if (target < arr[m]){
//               s = m + 1;
//           } else if (target > arr[m]) {
//               e = m - 1;
//           }
//           else {
//               return m;
//           }
//        }
//        return -1;
//    }
    static int OrderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
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
