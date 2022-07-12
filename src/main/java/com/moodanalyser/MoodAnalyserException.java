package com.moodanalyser;

public class MoodAnalyserException extends Exception {

    public ExceptionType type;

    public enum ExceptionType {
        NULL, EMPTY, INVALID;
    }

    public MoodAnalyserException(ExceptionType type, String msg) {
        super(msg);
        this.type = type;
    }
}
