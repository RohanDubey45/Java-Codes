package com.rohan;

import java.util.Arrays;

public class String_Ls {
    public static void main(String[] args) {
        String str = "Rohan";
        char ch = 'n';
//        System.out.println(Arrays.toString(str.toCharArray())); // To convert String into an array use this
//        boolean ans = FindChar2(str,ch);
//        System.out.println(ans);
    }
    static boolean FindChar(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    // next method
    static boolean FindChar2(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(char element : str.toCharArray()){
            if(target == element){
                return true;
            }
        }
        return false;
    }

}
