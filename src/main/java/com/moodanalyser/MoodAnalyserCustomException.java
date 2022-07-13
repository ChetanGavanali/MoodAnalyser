package com.moodanalyser;

public class MoodAnalyserCustomException {
    public String message;
    String returnMessage;

    public MoodAnalyserCustomException(String message)
    {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,
                        "Please enter some thing!");
            }
            returnMessage = (message.contains("sad")) ? "SAD" : "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL, "Please enter some thing!");
        }
        return returnMessage;
    }

    public static void main(String[] args) {

        try {

            MoodAnalyserCustomException moodAnalyser = new MoodAnalyserCustomException(null);
            String mood = moodAnalyser.analyseMood();
            System.out.println("My Mood is " + mood);
        } catch (MoodAnalyserException e) {
            System.out.println(e.type);
        }
    }
}
