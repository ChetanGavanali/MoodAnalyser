package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserConstructorTest {
    @Test
    public void respondAsSadMoodWithConstructor() {
        MoodAnalyserConstructor moodAnalyzer = new MoodAnalyserConstructor();
        String result = moodAnalyzer.analyseMood("I am in sad Mood");
        System.out.println("Iam in " + result + " mood.");
        Assertions.assertEquals("SAD", result);
    }
}

