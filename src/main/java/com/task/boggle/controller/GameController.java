package com.task.boggle.controller;

import com.task.boggle.board.Board;
import com.task.boggle.board.service.BoardService;
import com.task.boggle.controller.model.GetBoardResponse;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.GetMapping;
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
        return new GetBoardResponse();
    }
}
