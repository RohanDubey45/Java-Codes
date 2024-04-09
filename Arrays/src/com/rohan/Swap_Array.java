package com.rohan;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap_Array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        Swap(arr, 0 ,4);

        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
