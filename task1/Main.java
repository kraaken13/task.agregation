package com.tasks.task1;

public class Main {
    public static void main(String[] args) {
        Test1 test1=new Test1();
        test1.setA(10);
        test1.setB(5);
        System.out.println(test1.sumAB());
        System.out.println(test1.getBigger());
        System.out.println(test1.toString());
    }
}
