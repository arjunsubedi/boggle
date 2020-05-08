package com.task.boggle.dictionary;

import java.util.List;

public class WordFinder {

    private static DictionaryWord root;
    public void setWordList(List<String> wordList) {
        root = new DictionaryWord();
        for(String word: wordList) insert(root,word);
    }

    private void insert(DictionaryWord root, String Key) {
        int n = Key.length();
        DictionaryWord pChild = root;
        for(int i=0; i<n; i++){
            int index = Key.charAt(i) - 'A';
            if(pChild.Child == null){
                pChild.Child[index] = new DictionaryWord();
            pChild =pChild.Child[index];
            }
            pChild.end = true;
        }

    }

    public List<String> findPossibleWord(char[][] puzzel) {
    }
}
