package com.rohan;

public class Search_in_String {
    public static void main(String[] args) {
        String str = "Rohan";

        boolean ans = toFindChar(str, 'a');
        System.out.println(ans);

        System.out.println(str.toCharArray());
        System.out.println(str.length());

    }
    static boolean toFindChar(String str , char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.isEmpty()){
                return false;
            }
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
