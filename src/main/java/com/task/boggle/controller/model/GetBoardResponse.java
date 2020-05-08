package com.task.boggle.controller.model;

import java.util.ArrayList;
import java.util.List;

public class GetBoardResponse {
    private List<List<Character>> puzzel;

    public GetBoardResponse(char[][] puzzleArray) {
        List<List<Character>> rowList = new ArrayList<List<Character>>();
        for (char[] row : puzzleArray) {
            List<Character> colList = new ArrayList<Character>();
            for (char col : row) {
                colList.add(col);
            }
            rowList.add(colList);
        }
        this.puzzel = rowList;
    }

    public List<List<Character>> getPuzzel() {
        return puzzel;
    }

    public void setPuzzel(List<List<Character>> puzzel) {
        this.puzzel = puzzel;
    }
}
