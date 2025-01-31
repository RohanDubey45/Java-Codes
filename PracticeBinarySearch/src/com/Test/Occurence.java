package com.Test;

import java.util.Arrays;

public class Occurence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,5};
        int target = 2;

        int[] ans = findOccurence(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] findOccurence(int[] arr, int target){

        int[] ans = {-1,-1};
        int start = search(arr,target,true);
        int end = search(arr,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int search(int[] arr , int target , boolean firstIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if (firstIndex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
