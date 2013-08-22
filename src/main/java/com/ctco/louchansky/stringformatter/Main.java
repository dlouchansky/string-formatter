package com.ctco.louchansky.stringformatter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Got string: ab\\\\\\ncd\\\\\\nef");
        System.out.println("Result: " + new StringFormatter("ab\\\\\\ncd\\\\\\nef").formatNewlines());
    }

}
