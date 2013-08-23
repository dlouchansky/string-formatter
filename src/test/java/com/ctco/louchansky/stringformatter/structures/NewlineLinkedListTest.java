package com.ctco.louchansky.stringformatter.structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewlineLinkedListTest {

    @Test
    public void testTryToEmptyIfEmptyList() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();

        list.tryToEmpty();

        assertEquals(0, list.size());
    }

    @Test
    public void testTryToEmptyIfFirstCharNewlineAndSizeIs1() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();

        list.push('\n');
        list.tryToEmpty();

        assertEquals(1, list.size());
    }

    @Test
    public void testTryToEmptyIfFirstCharNewlineAndSizeMoreThan2() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();

        list.push('\n');
        list.push('\\');
        list.tryToEmpty();

        assertEquals(0, list.size());
    }


    @Test
    public void testTryToEmptyIfWrongSymbols() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();

        list.push('\\');
        list.push('k');
        list.tryToEmpty();

        assertEquals(2, list.size());
    }


}
