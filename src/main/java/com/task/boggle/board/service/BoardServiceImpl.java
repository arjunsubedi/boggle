package com.task.boggle.board.service;

import com.task.boggle.board.Board;

public class BoardServiceImpl implements BoardService{
    @Override
    public Board getRandomBoard() {
        Board board = new Board();
        board.setPuzzel(getPuzzel());
        return board;
    }

    private char[][] getPuzzel() {

    }
}
