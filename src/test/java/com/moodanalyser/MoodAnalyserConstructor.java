package com.moodanalyser;

public class MoodAnalyserConstructor {
    public String message;
    String returnMessage;

    public MoodAnalyserConstructor() {
    }

    public MoodAnalyserConstructor(String message)
    {
        this.message = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() {
        return returnMessage = (message.contains("sad")) ? "SAD" : "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyserConstructor moodAnalyser = new MoodAnalyserConstructor();
        String sadMood = moodAnalyser.analyseMood("Iam in sad mood");
        System.out.println("My Mood is " + sadMood);
        String happyMood = moodAnalyser.analyseMood("Iam in happy mood");
        System.out.println("My Mood is " + happyMood);
    }
}
