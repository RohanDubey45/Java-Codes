package com.Test;

public class SearchInfinite {
    public static void main(String[] args) {
//        To find the target in infinite length array without using arr.length function
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int ans = findRange(arr, target);
        System.out.println(ans);
    }
    static int findRange(int[] arr, int target) {
//     Initially we will start with the box length of 2 and then double it by moving to next box like 2 doubles 4
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target, int start , int end) {
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
