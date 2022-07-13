package com.moodanalyser;

public class MoodAnalyser {
    public static String analyseMood() {
        return null;
    }

    public String moodAnalysis(String msg) {

        if (msg.contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {

        MoodAnalyser moodAnalysis = new MoodAnalyser();
        String sadMood = moodAnalysis.moodAnalysis("Iam in sad mood");
        System.out.println("My Mood is: " + sadMood);
        String happyMood = moodAnalysis.moodAnalysis("Iam in happy mood");
        System.out.println("My Mood is: " + happyMood);

    }
}
