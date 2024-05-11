package com.hrp.entities;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

    private String word1;
    private String word2;

    public Anagram(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public boolean verifyIsAnagram() {
        if (word1.length() == 1 && word2.length() == 1){
            return word1.equals(word2);
        }
        if (word1.length() ==  word2.length()){
            LinkedList<String> linkedWord1 = new LinkedList<>(Arrays.asList(word1.split("")));
            LinkedList<String> linkedWord2 = new LinkedList<>(Arrays.asList(word2.split("")));
            while (!linkedWord1.isEmpty()) {
                String temp = linkedWord1.removeFirst();
                if (!linkedWord2.remove(temp)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
