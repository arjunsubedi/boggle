package com.task.boggle.dictionary;

public class DictionaryWord {
    DictionaryWord[] Child = new DictionaryWord[26];

    boolean end;

    public DictionaryWord[] getChild() {
        return Child;
    }

    public boolean isEnd() {
        return end;
    }

    public DictionaryWord(){
        end = false;
        for(int i=0; i<26; i++){
            Child[i] = null;
        }


    }
}
