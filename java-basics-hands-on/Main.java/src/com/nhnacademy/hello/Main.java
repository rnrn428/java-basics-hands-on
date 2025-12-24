package com.nhnacademy.hello;

public class Main {
    public static void main(String[] args) {
      int firstNumber = 10;
      String user_name = "Kim";
      double _price = 99.9;
      boolean isValid = true;
      int classValue = 5;
      String $message = "Hi";
      System.out.println("Hello java!"+" "+ firstNumber + " " + user_name + " "+_price
                          + " " + isValid+ " " + classValue+ " " + $message);
      
      int x = 5;
      int y = x;
      x = 10;
      System.out.println("x = " + x + ", y = " + y);
      
      int a = 10;
      int b = a;
      a = 20;
      System.out.println("a = " + a + ", b = " + b);

      int[] arr1 = {1,2,3};
      int[] arr2 = arr1;
      arr1[0] = 100;
      System.out.println("arr1[0] = " + arr1[0] + ", arr2[0] = " + arr2[0]);


      String s1 = "Hello";
      String s2 = "Hello";
      String s3 = new String("Hello");

      System.out.println(s1 == s2);
      System.out.println(s1 == s3);
      System.out.println(s1.equals(s3));

      Integer a1 = 100;
      Integer b1 = 100;
      Integer c = 200;
      Integer d = 200;

      System.out.println(a1==b1);
      System.out.println(c == d);

      



  }
}
