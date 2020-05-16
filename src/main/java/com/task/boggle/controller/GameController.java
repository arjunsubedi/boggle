package com.task.boggle.controller;
import com.task.boggle.board.Board;
import com.task.boggle.board.service.BoardService;
import com.task.boggle.controller.model.GetBoardResponse;
import com.task.boggle.controller.model.ValidateWordResponse;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/dashboard")
public class GameController {
    private final BoardService boardService;

    public GameController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public GetBoardResponse getBoard(HttpSession session){
        Board board = boardService.getRandomBoard();
        session.setAttribute("currentBoard", board);
        session.setAttribute("score",0);
        return new GetBoardResponse(board.getPuzzel());
    }
    @GetMapping("/word/{word}")
    public ValidateWordResponse validateWord(@PathVariable String word, HttpSession session){
        Board board = (Board) session.getAttribute("currentBoard");
        int score = (int) session.getAttribute("score");
        String word1=word.toUpperCase();
        if(board.getPossibleWord().contains(word1)){
            score += calculatePoint(word);
        }
        session.setAttribute("score", score);
        return new ValidateWordResponse(board.getPossibleWord().contains(word1), score);
    }

    private int calculatePoint(String word) {
        switch(word.length()){
            case 3:
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            case 8:
                return 11;
        }
        return 0;
    }

}
