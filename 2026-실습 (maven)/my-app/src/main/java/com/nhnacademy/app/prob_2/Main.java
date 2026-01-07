package com.nhnacademy.app.prob_2;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        String str1 = "JAVA";
        String str2 = null;
        String str3 = "";

        System.out.println(
                "1. 직접 문자열 구현 : " + isNullOrEmpty(str1) + " " + isNullOrEmpty(str2) + " " + isNullOrEmpty(str3));

        System.out.println("2. Apache 구현 : " + StringUtils.isEmpty(str1) + " " +
                StringUtils.isEmpty(str2) + " " + StringUtils.isEmpty(str3));
    }

    public static boolean isNullOrEmpty(String str) {
        if (Objects.isNull(str) || str.isEmpty()) {
            return true;
        }

        return false;
    }

}
