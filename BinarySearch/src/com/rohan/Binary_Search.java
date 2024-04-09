package com.rohan;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 14};

        int[] des = {14,12,10,8,5,3};

//        int index = findTarget(arr, 14);
//        System.out.println(index);

//        For descending array
        int index1 = findTarget_des(des, 3);
        System.out.println(index1);
    }

    //    static int findTarget(int[] arr, int target) {
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//
//        }
//        return -1;
//    }
//}
    static int findTarget_des(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}



