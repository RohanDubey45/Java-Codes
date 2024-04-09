package com.Test;

public class Ceil_Floor {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int target = 1;
//        int ans = Ceil(arr,target);
        int ans = Floor(arr,target);
        System.out.println(ans);
    }
//    static int Ceil(int[] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//        if (target > arr[end]){
//            return -1;
//        }
//        while (start <= end){
//            int mid = start + (end - start)/2;
//            if (target < arr[mid]){
//                end = mid - 1;
//            }
//            else if(target > arr[mid]){
//                start = mid + 1;
//            }
//            else {
//                return mid;
//            }
//        }
//        return arr[start];
//    }
static int Floor(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;

    while (start <= end){
        int mid = start + (end - start)/2;
        if (target < arr[mid]){
            end = mid - 1;
        }
        else if(target > arr[mid]){
            start = mid + 1;
        }
        else {
            return mid;
        }
    }
    return end;
}
}
