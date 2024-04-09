package com.rohan;

public class Rotated_Binary_Search {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 4;

        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr, int target){

        int pivot = findPivot(arr);

//      if pivot is not found
        if(pivot == -1){
            return BinarySearch(arr,target,0,arr.length -1);
        }

//        if pivot is found
        if(arr[pivot] == target){
            return pivot;
        }
        if(arr[0] < target){
            return BinarySearch(arr,target,0,pivot);
        }
        return BinarySearch(arr,target,pivot+1,arr.length - 1);


    }
    static int BinarySearch(int[] arr,int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
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

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if (arr[start]>=arr[mid]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
