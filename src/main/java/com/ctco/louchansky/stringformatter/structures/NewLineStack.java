package com.ctco.louchansky.stringformatter.structures;

import java.util.Stack;

public class NewlineStack<Character> extends Stack<Character> {

    public String toString() {

        String result = "";
        while (!this.isEmpty()) {
            result += this.pop();
        }
        return result;

    }

    public void addAllIfNotEmptyAndClear(NewlineLinkedList<Character> tempStorage) {

        tempStorage.tryToEmpty();

        if (!tempStorage.isEmpty()) {
            this.addAll(tempStorage);
            tempStorage.clear();
        }

    }

}
