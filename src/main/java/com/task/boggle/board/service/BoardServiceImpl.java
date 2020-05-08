package com.task.boggle.board.service;

import com.task.boggle.board.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class BoardServiceImpl implements BoardService{
    Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
    @Override
    public Board getRandomBoard() {
        Board board = new Board();
        board.setPuzzel(getPuzzel());

        return board;
    }

    private char[][] getPuzzel() {
        try {
        char[][] puzzel = new char[4][4];
        File file = new File("boggle_board");
        File[] boardList = file.listFiles();
        File randomeBoard = Objects.requireNonNull(boardList)[new Random().nextInt(boardList.length)];
        logger.info("Getting random board at: ",randomeBoard.getAbsolutePath());
        List<String> puzzelString = Files.readAllLines(Paths.get(randomeBoard.getAbsolutePath()), StandardCharsets.UTF_8);
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                puzzel[i][j] = puzzelString.get(i).split(",")[j].charAt(0);
            }
        }
        return puzzel;
        } catch (IOException e) {
            e.printStackTrace();
            return getPuzzel();
        }
    }
}
