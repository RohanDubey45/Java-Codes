package com.rohan;

public class Search_1d {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int ans = toSearch(arr , 51);
        System.out.println(ans);

        int res = toSearch(arr, 41 , 1 , 4);
        System.out.println(res);

    }
//    To search element in 1d array
    static int toSearch(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

//    To search element in range for 1d array only
    static int toSearch(int[] arr , int target , int start , int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
