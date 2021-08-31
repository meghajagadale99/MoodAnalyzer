package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in any Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
        }

    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String mood;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMood_ShouldThrow_Exception() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try {
            moodAnalyzer.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.exceptionType.ENTERED_NULL, e.type);
        }
    }
}
