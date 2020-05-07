package com.task.buggle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuggleApplication {

    private static final String FILE_NAME="words_alpha.txt";
    public static void main(String[] args) {
        SpringApplication.run(BuggleApplication.class, args);
    }

}
