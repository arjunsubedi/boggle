package com.task.boggle;

import com.task.boggle.dictionary.WordFinder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class BoggleApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(BoggleApplication.class);
    private static final String FILE_NAME="words_alpha.txt";

    private final WordFinder wordFinder;

    public BoggleApplication(WordFinder wordFinder) {
        this.wordFinder = wordFinder;
    }


    public static void main(String[] args) {
        SpringApplication.run(BoggleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       List<String> wordList = Files.readAllLines(Paths.get(new File(FILE_NAME).getAbsolutePath()), StandardCharsets.UTF_8);
       wordList = wordList.stream().filter(word ->(word.length() > 2 && word.length() < 9)).map(String::toUpperCase).collect(Collectors.toList());
       logger.info("Total dictionary words: {}", wordList.size());
       wordFinder.setWordList(wordList);
    }

}
