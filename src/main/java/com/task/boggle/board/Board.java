package com.task.boggle.board;

import java.util.List;

public class Board {
    private char[][] puzzel;

    private List<String> possibleWord;

    public List<String> getPossibleWord() {
        return possibleWord;
    }

    public void setPossibleWord(List<String> possibleWord) {
        this.possibleWord = possibleWord;
    }

    public char[][] getPuzzel() {
        return puzzel;
    }

    public void setPuzzel(char[][] puzzel) {
        this.puzzel = puzzel;
    }
}
