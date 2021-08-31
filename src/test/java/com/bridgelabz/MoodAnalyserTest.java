package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a Sad Message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);

    }
    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("This is Happy Message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
