package com.rohan;

public class Linear_Search {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 54, 5};
        int target = 540;

//        To find element in array
//        int ans = LinearSearch(arr, target);
//        System.out.println(ans);

//      To find element in array in certain range
        int ans2 = LinearSearch2(arr, 1,4,30);
        System.out.println(ans2);
    }
    static int LinearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }


//      To find element in array in certain range
    static int LinearSearch2(int[] arr, int start, int end , int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }

}
