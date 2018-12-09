package com.kavindu.helloworld;
/**
 * Created by Kavindu on 12/9/2018.
 */
public final class Test {
    private Test() {
    }
    public static void main(final String[] args) {
        printThis("HI check jenkins checkStyle");
    }

    public static void printThis(final String a) {
        System.out.println(a);
    }
}
