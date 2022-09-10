package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    static MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        String mood = moodAnalyzer.analyzeMood("Sad");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy() {
        String mood = moodAnalyzer.analyzeMood("Happy");
        Assert.assertEquals("HAPPY", mood);
    }
}
