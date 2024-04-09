package com.rohan;

public class Test {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 3, 2, 1};
        int target = 1;

        int ans = Search(arr, target);
        System.out.println(ans);

    }
    static int Search(int[] arr, int target){
        int peak = PeakMountain(arr,target);
        int firstTry = OrderOfAgnostic(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return OrderOfAgnostic(arr,target,peak+1, arr.length - 1);
    }
    static int PeakMountain(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;

        while (start < end){

            int mid = start + (end - start)/2;

            if(arr[mid]>arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
    static int OrderOfAgnostic(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
