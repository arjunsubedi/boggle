package com.task.boggle.dictionary;

import java.util.ArrayList;
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
        List<String> possibleWordList = new ArrayList<>();
        boolean[][] used = new boolean[4][4];
        DictionaryWord pChild = root;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(pChild.Child[(puzzel[i][j]) - 'A'] !=null){
                    str.append(puzzel[i][j]);
                    searchPossibleWord(pChild.Child[(puzzel[i][j]) - 'A'], puzzel, i, j, used, str.toString(), possibleWordList);
                    str = new StringBuilder();
                }
            }
        }
        return possibleWordList;
    }

    private void searchPossibleWord(DictionaryWord dictionaryWord, char[][] puzzel, int i, int j, boolean[][] used, String toString, List<String> possibleWordList) {
    }
}
