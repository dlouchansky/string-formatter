package com.ctco.louchansky.stringformatter;

public class Main {

    public static void main(String[] args) {
        String s = "ab\\\\\\ncd\\\\\\nef";
        System.out.println("Got string: " + s);
        System.out.println("Result: " + new StringFormatter().formatNewlines(s));
    }

}
