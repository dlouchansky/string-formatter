package com.ctco.louchansky.stringformatter.structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewlineStackTest {
    @Test
    public void testStringConversionTwoTimes() throws Exception {
        NewlineStack<Character> stack = new NewlineStack<Character>();

        stack.push('a');
        stack.push('b');

        stack.toString();
        assertEquals("ba", stack.toString());
    }

}
