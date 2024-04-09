package com.Test;

public class Search_in_Rotated_array {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3};
        int target = 1;
//        int ans = findPivot(arr);
//        System.out.println(ans);
        int res = search(arr,target);
        System.out.println(res);
    }
    static int search(int[] arr,int target){
        int pivot = findPivot(arr);
        if (pivot == -1){
            return BinarySearch(arr,target,0, arr.length-1); // array is not rotated
        }
        if (target == arr[pivot]){
            return pivot; // pivot is found and if target is equal to pivot
        }
        if (target >= arr[0]){
            return BinarySearch(arr,target,0,pivot); // if target is greater than the first element then we will search till the pivot
        }
       //else
        return BinarySearch(arr,target,pivot+1, arr.length-1);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            else if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    //binary search to find the element
    static int BinarySearch(int[] arr,int target, int start , int end){
        while (start <= end){
            int mid = start + (end -start)/2;
            if (target < arr[mid]){
                end = mid -1;
            }
            if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
