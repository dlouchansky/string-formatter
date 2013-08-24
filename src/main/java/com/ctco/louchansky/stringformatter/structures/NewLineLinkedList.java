package com.ctco.louchansky.stringformatter.structures;

import java.util.LinkedList;

public class NewlineLinkedList<Character> extends LinkedList<Character> {

    public void tryToEmpty() {
        if (this.size() > 1 && this.getLast().equals('\n'))
            this.clear();
    }

    public NewlineLinkedList<Character> getAllAndClear() {

        this.tryToEmpty();
        NewlineLinkedList<Character> data = new NewlineLinkedList<Character>();

        if (!this.isEmpty()) {
            data.addAll(this);
            this.clear();
        }

        return data;

    }

}
