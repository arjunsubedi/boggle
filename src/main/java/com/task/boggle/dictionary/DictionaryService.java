package com.task.boggle.dictionary;

import java.util.List;

public interface DictionaryService {
    List<String> getPossibleWord(char[][] puzzel);
}
