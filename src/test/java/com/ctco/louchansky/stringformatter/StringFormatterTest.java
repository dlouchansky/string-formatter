package com.ctco.louchansky.stringformatter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFormatterTest {
    @Test(expected = NullPointerException.class)
    public void testGetStringIfNoStringAssigned() throws Exception {
        StringFormatter s = new StringFormatter();
        s.getString();
    }

    @Test(expected = NullPointerException.class)
    public void testFormatNewlinesIfNoStringAssigned() throws Exception {
        StringFormatter s = new StringFormatter();
        s.formatNewlines();
    }

    @Test
    public void testFormatNewlinesNothingToFormat() throws Exception {
        StringFormatter s = new StringFormatter("abcdef");
        assertEquals(s.formatNewlines(), "abcdef");
    }

    @Test
         public void testFormatNewlinesRemoveTwoNewlines() throws Exception {
        StringFormatter s = new StringFormatter("ab\\\ncd\\\nef");
        assertEquals(s.formatNewlines(), "abcdef");
    }

    @Test
    public void testFormatNewlinesRemoveOneNewline() throws Exception {
        StringFormatter s = new StringFormatter("abc\\\ndef");
        assertEquals(s.formatNewlines(), "abcdef");
    }

    @Test
    public void testFormatNewlinesWrongOrder() throws Exception {
        StringFormatter s = new StringFormatter("abc\\n\\\\def");
        assertEquals(s.formatNewlines(), "abc\\n\\\\def");
    }

    @Test
    public void testFormatNewlinesNoNCharacter() throws Exception {
        StringFormatter s = new StringFormatter("abc\\\\def");
        assertEquals(s.formatNewlines(), "abc\\\\def");
    }

    @Test
    public void testFormatNewlinesWrongBackslashCount() throws Exception {
        StringFormatter s = new StringFormatter("abc\\ndef");
        assertEquals(s.formatNewlines(), "abc\\ndef");
    }



}
