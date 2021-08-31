package com.example.testapp.data;
 /* a Value of word and a number of its repetitions in the text  */
public class Word {

    /*Value of word*/
    private String value;

    /*Number of repetitions of a word in the text*/
    private int count;


    public Word(String value, int count) {
        setValue(value);
        setCount(count);
    }

    public Word() {}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        if (obj == this)
            return true;
        return (this.getValue().equals(((Word) obj).getValue()) && (this.getCount() == ((Word) obj).getCount()));
    }
}
