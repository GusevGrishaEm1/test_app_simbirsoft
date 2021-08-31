package com.example.testapp.data;

import com.example.testapp.exceptions.NotFoundWordException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/*Web page with an address and a list of words*/
public class WebPage {

    /*web address*/
    private String url;

    /* list of words on the web page*/
    private List<Word> listOfWords;

    public WebPage(String url) {
        setUrl(url);
    }

    public WebPage() {}

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Word> getListOfWords() {
        return listOfWords;
    }


    /* Set list of words(value and number of repetitions) from the web page */
    public void setListOfWords() throws IOException {
        Document document = Jsoup.connect(this.url).get();
        String text = document.text().toUpperCase();
        String delimiters  = ",.!?;:()[]{}«»—'\"\\/\s\n\r\t";
        Map<String, Integer> mapWords = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(text, delimiters);
        String word;
        String pattern = "[А-ЯA-Z]+(-?)([А-ЯA-Z]*)";
        while (stringTokenizer.hasMoreElements()) {
            word = stringTokenizer.nextToken();
            if(word.matches(pattern)) {
                if (mapWords.containsKey(word)) {
                    mapWords.put(word, mapWords.get(word) + 1);
                } else {
                    mapWords.put(word, 1);
                }
            }
        }
        listOfWords = new ArrayList<>();
        for (String wordValue : mapWords.keySet()) {
            listOfWords.add(new Word(wordValue, mapWords.get(wordValue)));
        }
    }

    /* Get word from the list of words on the web page by value  */
    public Word getWordByValue(String valueWord) throws NotFoundWordException {
        int index = 0;
        while (!listOfWords.get(index).getValue().equals(valueWord))
            index++;
        if (index < listOfWords.size())
            return listOfWords.get(index);
        else throw new NotFoundWordException("Слово не найдено");
    }

}
