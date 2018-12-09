package com.kavindu.helloworld;
/**
 * Created by Kavindu on 12/9/2018.
 */
public final class Test {
    /**
     * This is private constructor.
     * */
    private Test() {
    }

    /**
     * This is main method.
     * @param args args
     * */
    public static void main(final String[] args) {
        printThis("HI check jenkins checkStyle");
    }

    /**
     * This is Print method.
     * @param a - print String
     * */
    public static void printThis(final String a) {
        System.out.println(a);
    }
}
