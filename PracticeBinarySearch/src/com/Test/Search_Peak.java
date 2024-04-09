package com.Test;

public class Search_Peak {
    public static void main(String[] args) {
        // Search the target in the mountain array
        // step 1 Find in peak
        // step 2 then use binary search in asc part of array and compare it till peak
        // step 3 if target not found then compare it from peak + 1 til arr.length - 1
        int[] arr = {1,5,6,4,3,2};
        int target = 2;

        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int peak = peak(arr);
        int firstTry = order_agnostic(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return order_agnostic(arr,target,peak+1,arr.length-1);
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int order_agnostic(int[] arr, int target , int start ,int end){
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
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
