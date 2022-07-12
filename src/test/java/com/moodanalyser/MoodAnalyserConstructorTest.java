package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserConstructorTest {
    @Test
    public void respondAsSadMoodWithConstructor() {
        MoodAnalyserConstructor moodAnalyser = new MoodAnalyserConstructor();
        String result = moodAnalyser.analyseMood("I am in sad Mood");
        System.out.println("Iam in " + result + " mood.");
        Assertions.assertEquals("SAD", result);
    }

    @Test
    public void respondAsHappyMoodWithConstructor() {
        MoodAnalyserConstructor moodAnalyser = new MoodAnalyserConstructor();
        String result = moodAnalyser.analyseMood("I am in happy Mood");
        System.out.println("Iam in " + result + " mood.");
        Assertions.assertEquals("HAPPY", result);
    }
}

