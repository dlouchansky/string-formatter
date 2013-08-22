package com.ctco.louchansky.stringformatter;

import com.ctco.louchansky.stringformatter.structures.NewlineLinkedList;
import com.ctco.louchansky.stringformatter.structures.NewlineStack;

public class StringFormatter {

    private String data;

    public StringFormatter() {
    }

    public StringFormatter(String _data) {
        data = _data;
    }

    public String getString() {
        if (data == null)
            throw new NullPointerException("There is no string yet");

        return data;
    }

    public void setString(String _data) {
        data = _data;
    }

    public void reverse() {
        if (data == null)
            throw new NullPointerException("There is no string yet");

        data = new StringBuffer(data).reverse().toString();
    }

    public char[] getStringChars() {
        if (data == null)
            throw new NullPointerException("There is no string yet");

        return data.toCharArray();
    }

    public String formatNewlines() {
        if (data == null)
            throw new NullPointerException("Set string first");

        if (!data.contains("\\\n"))
            return data;

        this.reverse();

        NewlineStack<Character> resultStack = new NewlineStack<Character>();
        NewlineLinkedList<Character> tempStorage = new NewlineLinkedList<Character>();

        for (Character c : this.getStringChars()) {

            if (c == '\\') {

                tempStorage.push(c);

            } else if (c == '\n') {

                resultStack.addAllIfNotEmptyAndClear(tempStorage);
                tempStorage.push(c);

            } else {

                resultStack.addAllIfNotEmptyAndClear(tempStorage);
                resultStack.push(c);

            }
        }

        return resultStack.toString();
    }

}
