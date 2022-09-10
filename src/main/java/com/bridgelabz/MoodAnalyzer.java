package com.bridgelabz;


public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            }
            return "HAPPY";
        } catch (Exception e) {
            return "HAPPY";
        }
    }
}
