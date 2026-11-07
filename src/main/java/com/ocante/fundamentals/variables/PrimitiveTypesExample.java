package com.ocante.fundamentals.variables;

public class PrimitiveTypesExample {

    public static void main(String[] args) {

        byte smallNumber = 100;
        short mediumNumber = 30000;
        int intergerNumber = 100000;
        long largeNumber = 9000000L;

        float decimalFloat = 3.14f;
        double decimalDouble = 3.141592653589793;

        char letter = 'J';
        boolean isjavaFun = true;

        int maximum = Integer.MAX_VALUE;
        int overflow = maximum + 1;

        System.out.println("Overflow result: " + overflow);

        System.out.println("JAVA PRIMITIVE TYPE EXEMPLE");
        System.out.println("----------------------------");

        System.out.println("BYTE lIMITS");
        System.out.println("Minimun: " + Byte.MIN_VALUE);
        System.out.println("Maximun: " + Byte.MAX_VALUE);

        System.out.println("INT LIMITS");
        System.out.println("Minimum: " + Integer.MIN_VALUE);
        System.out.println("Maximum: " + Integer.MAX_VALUE);

        System.out.println("LONG LIMITS");
        System.out.println("Minimun: " + Long.MIN_VALUE);
        System.out.println("Maximun: " + Long.MAX_VALUE);

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + intergerNumber);
        System.out.println("long: " + largeNumber);

        System.out.println("float: " + decimalFloat);
        System.out.println("double: " + decimalDouble);

        System.out.println("char: " + letter);
        System.out.println("isJavaFun: " + isjavaFun);
    }
}
