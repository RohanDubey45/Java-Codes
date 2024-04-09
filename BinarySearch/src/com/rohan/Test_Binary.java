package com.rohan;

public class Test_Binary {
    public static void main(String[] args) {

        int[] arr = {-4,1,2,3,4,5,6,7};

//        int ans = BinarySearch(arr, 2);
//        System.out.println(ans);

        int res = Agnostic_Binary(arr, -4);
        System.out.println(res);

    }
    static int BinarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int Agnostic_Binary(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isASC = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(isASC){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if(target < arr[mid]){
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
