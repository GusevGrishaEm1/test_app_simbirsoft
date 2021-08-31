package com.example.testapp.tests;

import com.example.testapp.data.Word;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {

    private Word word;

    @Before
    public void setUp() {
        word = new Word();
    }

    @Test
    public void setValueTest() {
        String exceptedValue = "КОРОВА";
        word.setValue("КОРОВА");
        assertEquals(exceptedValue, word.getValue());
    }

    @Test
    public void setCountTest() {
        int exceptedCount = 6;
        word.setCount(6);
        assertEquals(exceptedCount, word.getCount());
    }

    @Test
    public void testEqualsTest() {
        Word word1 = new Word("HELLO",5);
        Word word2 = new Word("HELLO",5);
        assertTrue(word1.equals(word2));
    }
}