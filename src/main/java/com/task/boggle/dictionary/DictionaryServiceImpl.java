package com.task.boggle.dictionary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DictionaryServiceImpl implements DictionaryService{
    private Logger logger  = LoggerFactory.getLogger(DictionaryServiceImpl.class);

    private final WordFinder wordFinder;

    public DictionaryServiceImpl(WordFinder wordFinder) {
        this.wordFinder = wordFinder;
    }

    @Override
    public List<String> getPossibleWord(char[][] puzzel) {
        logger.info("Getting all possible word");
        List<String> possibleWord = wordFinder.findPossibleWord(puzzel);

        return null;
    }
}
