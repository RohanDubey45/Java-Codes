package com.rohan;

public class Character_Problem {
    public static void main(String[] args) {

        char[] arr = {'c','e','g','i'};
        char target = 'd';

        char ans = Search(arr, target);
        System.out.println(ans);

    }
    static char Search(char[] arr , char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return arr[start % arr.length];
    }
}
