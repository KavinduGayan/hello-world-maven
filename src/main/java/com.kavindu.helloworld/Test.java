package com.kavindu.helloworld;
/**
 * Created by Kavindu on 12/9/2018.
 */
public final class Test {
    /** {@inheritDoc} */
    private Test() {
    }

    /** {@inheritDoc} */
    public static void main(final String[] args) {
        printThis("HI check jenkins checkStyle");
    }

    /** {@inheritDoc} */
    public static void printThis(final String a) {
        System.out.println(a);
    }
}
