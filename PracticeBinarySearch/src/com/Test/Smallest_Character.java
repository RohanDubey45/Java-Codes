package com.Test;

public class Smallest_Character {
    public static void main(String[] args) {
        char[] arr = {'b','d','f','h'};
        char target = 'g';
        char ans = search(arr,target);
        System.out.println(ans);
    }
    static char search(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
