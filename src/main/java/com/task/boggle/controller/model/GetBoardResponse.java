package com.task.boggle.controller.model;

import java.util.List;

public class GetBoardResponse {
    private List<List<Character>> puzzel;

    public List<List<Character>> getPuzzel() {
        return puzzel;
    }

    public void setPuzzel(List<List<Character>> puzzel) {
        this.puzzel = puzzel;
    }
}
