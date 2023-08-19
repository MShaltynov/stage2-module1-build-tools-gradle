package com.epam.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("11.22", "02", "33", "87");
//        List<String> strings = new ArrayList<>();
        //strings.add("0");
//        strings.add(null);
        System.out.println(isAllPositiveNumbers(strings));

    }

    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here

        for (String s : args) {
            if (s == null) {
                return false;
            }
            if (s.startsWith("0") && s.length() > 1) {
                return false;
            }
            try {
                if (Double.parseDouble(s) <= 0) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}