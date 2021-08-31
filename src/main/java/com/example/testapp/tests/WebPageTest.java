package com.example.testapp.tests;

import com.example.testapp.data.WebPage;
import com.example.testapp.data.Word;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WebPageTest {

    private WebPage webPage;

    @Before
    public void setUp() throws Exception {
        webPage = new WebPage();
    }

    @Test
    public void setUrlTest() {
        String exceptedUrl = "https://translate.google.com/";
        webPage.setUrl("https://translate.google.com/");
        assertEquals(exceptedUrl, webPage.getUrl());
    }

    @Test
    public void setListOfWordsTest() {
        webPage.setUrl("https://www.simbirsoft.com/");
        Word word = null;
        try {
            webPage.setListOfWords();
            word = webPage.getWordByValue("БЫСТРО");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Word exceptedWord = new Word( "БЫСТРО",6 );
        assertEquals(exceptedWord, word);
    }
}