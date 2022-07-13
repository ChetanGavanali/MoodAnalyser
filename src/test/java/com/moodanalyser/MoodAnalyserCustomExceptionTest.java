package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserCustomExceptionTest {
    @Test
    public void nullMood_ShouldThrowCustomException() {
        try {
            MoodAnalyserCustomException moodAnalyzer = new MoodAnalyserCustomException(null);
            String result = moodAnalyzer.analyseMood();
            System.out.println("Iam in " + result + " mood.");
        } catch (MoodAnalyserException e) {
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.NULL, e.type);
        }
    }
}
