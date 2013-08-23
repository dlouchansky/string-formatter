package com.ctco.louchansky.stringformatter.structures;

import com.ctco.louchansky.stringformatter.StringFormatter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewlineStackTest {
    @Test
    public void testToStringTwoTimes() throws Exception {
        NewlineStack<Character> stack = new NewlineStack<Character>();

        stack.push('a');
        stack.push('b');

        stack.toString();
        assertEquals("ba", stack.toString());

    }

    @Test
    public void testAddAllIfNotEmptyAndClearIfLinkedListIsOk() throws Exception {
        NewlineLinkedList<Character> tempStorage = new NewlineLinkedList<Character>();
        NewlineStack<Character> result = new NewlineStack<Character>();

        tempStorage.push('\n');
        tempStorage.push('\\');
        result.push('a');

        result.addAllIfNotEmptyAndClear(tempStorage);
        assertEquals(0, tempStorage.size());
        assertEquals(1, result.size());
    }

    @Test
    public void testAddAllIfNotEmptyAndClearIfLinkedListIsWrong() throws Exception {
        NewlineLinkedList<Character> tempStorage = new NewlineLinkedList<Character>();
        NewlineStack<Character> result = new NewlineStack<Character>();

        tempStorage.push('\\');
        tempStorage.push('\\');
        result.push('a');

        result.addAllIfNotEmptyAndClear(tempStorage);
        assertEquals(0, tempStorage.size());
        assertEquals(3, result.size());
    }

    @Test
    public void testAddAllIfNotEmptyAndClearIfLinkedListIsEmpty() throws Exception {
        NewlineLinkedList<Character> tempStorage = new NewlineLinkedList<Character>();
        NewlineStack<Character> result = new NewlineStack<Character>();

        result.push('a');

        result.addAllIfNotEmptyAndClear(tempStorage);
        assertEquals(0, tempStorage.size());
        assertEquals(1, result.size());
    }
}
