package com.nhnacademy.app;

import java.util.Random;

import org.apache.commons.math3.random.RandomDataGenerator;

public class App {
    public static void main(String[] args) {
        System.out.println("=== 실습 1 (1부터 100까지 난수 생성하기) ===");

        // 1. 자바의 기본 기능 Java.util
        randomByJava();

        // 2. 외부 라이브러리(Apache Commons) 사용
        randomByApache();

    }

    public static void randomByJava() {
        Random random = new Random();

        int result = random.nextInt(1, 100);
        System.out.println("1. 자바 기본 기능 : " + result);

    }

    public static void randomByApache() {
        RandomDataGenerator generator = new RandomDataGenerator();

        int result = generator.nextInt(1, 100);

        System.out.println("2. Apache를 이용한 랜덤 기능(외부 라이브러리) : " + result);

    }

}
