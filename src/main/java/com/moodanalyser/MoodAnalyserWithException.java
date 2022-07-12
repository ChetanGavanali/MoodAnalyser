package com.moodanalyser;

public class MoodAnalyserWithException {
    public String message;
    String returnMessage;

    public MoodAnalyserWithException() {
    }

    public MoodAnalyserWithException(String message)
    {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyserException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,
                        "Please enter some thing!");
            }
            returnMessage = (message.contains("sad")) ? "SAD" : "HAPPY";
        } catch (NullPointerException e) {
            return "Invalid";
        }
        return returnMessage;
    }

    public static void main(String[] args) throws MoodAnalyserException {
        MoodAnalyserWithException moodAnalyser = new MoodAnalyserWithException("Iam in sad mood");
        String sadMood = moodAnalyser.analyseMood();
        System.out.println("My Mood is " + sadMood);
        String happyMood = moodAnalyser.analyseMood("Iam in happy mood");
        System.out.println("My Mood is " + happyMood);
    }
}
