package com.task.boggle.controller;

import com.task.boggle.controller.model.GetBoardResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/dashboard")
public class GameController {
    @GetMapping
    public GetBoardResponse getBoard(HttpSession session){

        return new GetBoardResponse;
    }
}
