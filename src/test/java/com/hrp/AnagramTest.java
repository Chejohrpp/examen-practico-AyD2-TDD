package com.hrp;

import com.hrp.entities.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    private final String WORD1_ONE_LETTER = "a";
    private final String WORD2_ONE_LETTER = "a";
    private final boolean RESULT_ONE_LETTER = true;

    private final String WORD1_TWO_LETTER = "ab";
    private final String WORD2_TWO_LETTER = "ba";
    private final boolean RESULT_TWO_LETTER = true;

    private final String WORD1_ESPADA = "espada";
    private final String WORD2_PESADA = "pesada";
    private final boolean RESULT_ESPADA_PESADA = true;

    private final String WORD1_DIFFERENT_LENGHT = "aba";
    private final String WORD2_DIFFERENT_LENGHT = "abb";
    private final boolean RESULT_DIFFERENT_LENGHT = false;

    private final String WORD1_ESPALDA = "espalda";
    private final String WORD2_PESAODA = "pesaoda";
    private final boolean RESULT_ESPALDA_PESAODA = false;

    private final String WORD1_THREE_LETTER = "aba";
    private final String WORD2_THREE_LETTER = "bab";
    private final boolean RESULT_THREE_LETTER = false;

    private final String WORD1_FOUR_LETTER = "poiu";
    private final String WORD2_FOUR_LETTER = "ipuo";
    private final boolean RESULT_FOUR_LETTER = true;


    @Test
    void withOneLetterTest(){
        //arrage
        Anagram anagram = new Anagram(WORD1_ONE_LETTER, WORD2_ONE_LETTER);
        //act
        boolean isAnagram = anagram.verifyIsAnagram();

        //assert
        assertEquals(RESULT_ONE_LETTER, isAnagram);
    }

    @Test
    void withTwoLetterTest(){
        //arrage
        Anagram anagram = new Anagram(WORD1_TWO_LETTER, WORD2_TWO_LETTER);
        //act
        boolean isAnagram = anagram.verifyIsAnagram();

        //assert
        assertEquals(RESULT_TWO_LETTER, isAnagram);
    }

    @Test
    void withExampleTheTest() {
        //arrage
        Anagram anagram = new Anagram(WORD1_ESPADA, WORD2_PESADA);
        //act
        boolean isAnagram = anagram.verifyIsAnagram();

        //assert
        assertEquals(RESULT_ESPADA_PESADA, isAnagram);
    }

    @Test
    void notTheSameLenght(){
        //arrage
        Anagram anagram = new Anagram(WORD1_DIFFERENT_LENGHT, WORD2_DIFFERENT_LENGHT);
        //act
        boolean isAnagram = anagram.verifyIsAnagram();

        //assert
        assertEquals(RESULT_DIFFERENT_LENGHT, isAnagram);
    }

    @Test
    void notIsAnagramTest() {
        //arrage
        Anagram anagram = new Anagram(WORD1_ESPALDA, WORD2_PESAODA);
        //act
        boolean isAnagram = anagram.verifyIsAnagram();

        //assert
        assertEquals(RESULT_ESPALDA_PESAODA, isAnagram);
    }

    @Test
    void withThreeLetterTest(){
        //arrage
        Anagram anagram = new Anagram(WORD1_THREE_LETTER, WORD2_THREE_LETTER);
        //act
        boolean isAnagram = anagram.verifyIsAnagram();

        //assert
        assertEquals(RESULT_THREE_LETTER, isAnagram);
    }

    @Test
    void withFourLetterTest(){
        //arrage
        Anagram anagram = new Anagram(WORD1_FOUR_LETTER, WORD2_FOUR_LETTER);
        //act
        boolean isAnagram = anagram.verifyIsAnagram();

        //assert
        assertEquals(RESULT_FOUR_LETTER, isAnagram);
    }


}
