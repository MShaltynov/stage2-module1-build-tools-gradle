package com.epam.utils;

public class StringUtils {
    public static void main(String[] args) {
       boolean a= isPositiveNumber(null);
        System.out.println(a);
    }

    public static boolean isPositiveNumber(String str) {

        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) <= 0) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
