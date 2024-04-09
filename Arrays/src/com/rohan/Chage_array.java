package com.rohan;

import java.util.Arrays;

public class Chage_array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        Change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Change(int ...a){
        a[0] = 99;
    }

}
