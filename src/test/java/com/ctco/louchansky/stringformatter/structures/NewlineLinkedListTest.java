package com.ctco.louchansky.stringformatter.structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewlineLinkedListTest {

    @Test
    public void testTryToEmptyListIsEmpty() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();

        list.tryToEmpty();

        assertEquals(0, list.size());
    }

    @Test
    public void testTryToEmptyIfListContainsOnlyNewline() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();

        list.push('\n');
        list.tryToEmpty();

        assertEquals(1, list.size());
    }

    @Test
    public void testTryToEmptyIfListContainsCorrectSequence() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();
        list.push('\n');
        list.push('\\');
        list.push('\\');

        list.tryToEmpty();

        assertEquals(0, list.size());
    }


    @Test
    public void testTryToEmptyIfListContainsWrongSequence() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();
        list.push('\\');
        list.push('k');

        list.tryToEmpty();

        assertEquals(2, list.size());
    }

    @Test
    public void testGetAllAndClearIfListContainsCorrectSequence() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();
        list.push('\n');
        list.push('\\');

        NewlineLinkedList<Character> result = list.getAllAndClear();

        assertEquals(0, result.size());
    }

    @Test
    public void testGetAllAndClearIfListContainsWrongSequence() {
        NewlineLinkedList<Character> list = new NewlineLinkedList<Character>();

        list.push('\\');
        list.push('\\');
        NewlineLinkedList<Character> result = list.getAllAndClear();

        assertEquals(2, result.size());
    }

}
