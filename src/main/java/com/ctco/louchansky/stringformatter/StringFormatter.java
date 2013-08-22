package com.ctco.louchansky.stringformatter;

public class StringFormatter {

    private String data;

    // two types of constructor, just for convenience.

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

    public String formatNewlines() {
        if (data == null)
            throw new NullPointerException("Set string first");

        return data;
    }

}
