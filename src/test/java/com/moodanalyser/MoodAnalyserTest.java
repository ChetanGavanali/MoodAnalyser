package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void respondAsSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalysis("I am in sad Mood");
        System.out.println("Iam in " + result + " mood.");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    public void respondAsHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalysis("I am in happy Mood");
        System.out.println("Iam in " + result + " mood.");
        Assertions.assertEquals("Happy", result);
    }
}