package com.epam.utils;

public class StringUtils {
    public static void main(String[] args) {
        boolean a = isPositiveNumber("0");
        System.out.println(a);
    }

    public static boolean isPositiveNumber(String str) {
        if (str.startsWith("0")&&str.length()>1) {
            return false;
        }
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
