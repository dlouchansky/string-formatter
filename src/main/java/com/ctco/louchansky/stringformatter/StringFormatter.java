package com.ctco.louchansky.stringformatter;

import com.ctco.louchansky.stringformatter.structures.NewlineLinkedList;
import com.ctco.louchansky.stringformatter.structures.NewlineStack;

public class StringFormatter {

    public String reverse(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    public char[] getStringChars(String data) {
        return data.toCharArray();
    }

    public String formatNewlines(String data) {
        if (!data.contains("\\\n"))
            return data;

        data = this.reverse(data);

        NewlineStack<Character> resultStack = new NewlineStack<Character>();
        NewlineLinkedList<Character> tempStorage = new NewlineLinkedList<Character>();

        for (Character c : this.getStringChars(data)) {

            if (c == '\\') {

                tempStorage.push(c);

            } else if (c == '\n') {

                resultStack.addAll(tempStorage.getAllAndClear());
                tempStorage.push(c);

            } else {

                resultStack.addAll(tempStorage.getAllAndClear());
                resultStack.push(c);

            }
        }

        data = resultStack.toString();

        return data;
    }

}
