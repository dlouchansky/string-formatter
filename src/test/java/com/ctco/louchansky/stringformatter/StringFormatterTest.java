package com.ctco.louchansky.stringformatter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFormatterTest {

    @Test
    public void testFormatNewlinesEmptyString() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("", s.formatNewlines(""));
    }

    @Test
    public void testFormatNewlinesNothingToFormat() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abcdef", s.formatNewlines("abcdef"));
    }

    @Test
    public void testFormatNewlinesRemoveOneNewline() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abcdef", s.formatNewlines("abc\\\ndef"));
    }

    @Test
    public void testFormatNewlinesRemoveMultipleNewlines() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abcdef", s.formatNewlines("ab\\\ncd\\\nef\\\n"));
    }

    @Test
    public void testFormatNewlinesRemoveTwoNearNewlines() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abcdef", s.formatNewlines("abc\\\n\\\ndef"));
    }

    @Test
    public void testFormatNewlinesWrongOrder() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abc\\n\\\\def", s.formatNewlines("abc\\n\\\\def"));
    }

    @Test
    public void testFormatNewlinesWrongBackslashCount() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abc\\ndef", s.formatNewlines("abc\\ndef"));
    }

    @Test
    public void testFormatNewlinesRightAndWrongNotNear() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abcd\\nef", s.formatNewlines("abc\\\nd\\nef"));
    }

    @Test
    public void testReverseString() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("fedn\\cba", s.reverse("abc\\ndef"));
    }

    @Test
    public void testFormatNewlinesIfCorrectAndWrongNear() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abc\\ef", s.formatNewlines("abc\\\n\\\n\\ef"));
    }

    @Test
    public void testFormatNewlinesIfTwoNewlinesAreNear() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("abc\nef", s.formatNewlines("abc\\\n\nef"));
    }

    @Test
    public void testFormatNewlinesStringContainsOnlyBackslashes() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("\\\\\\", s.formatNewlines("\\\\\\"));
    }

    @Test
    public void testFormatNewlinesStringContainsOnlyNewlines() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("\n\n", s.formatNewlines("\n\n"));
    }

    @Test
    public void testFormatNewlinesStringContainsOnlyFormattedSymbols() throws Exception {
        StringFormatter s = new StringFormatter();
        assertEquals("", s.formatNewlines("\\\n\\\n"));
    }

}
