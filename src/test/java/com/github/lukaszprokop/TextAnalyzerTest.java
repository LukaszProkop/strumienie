package com.github.lukaszprokop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.github.lukaszprokop.TextAnalyzer.*;
import static org.testng.Assert.assertEquals;

public class TextAnalyzerTest {
    private String path;

    @BeforeMethod
    public void setUp() {
        path = "src/main/resources/text.txt";
    }

    @Test
    public void longestWordTest() {
        //given
        String expected = "przyszedł";
        //when
        String actual = longestWord(path);
        //then
        assertEquals(actual, expected, "nieprawidłowy wyraz");
    }

    @Test
    public void averageLetterNumberInWordsTest() {
        //given
        double expected = 5.066666666666666d;
        //when
        double actual = averageLetterNumberInWords(path);
        //then
        assertEquals(expected, actual, "niepoprawna srednia ilosc znakow na slowo");
    }

    @Test
    public void countWordsTest() {
        //given
        long expected = 15L;
        //when
        long actual = countWords(path);
        //then
        assertEquals(actual, expected, "niepoprawna ilość wyrazow w pliku");
    }

    @Test(dataProvider = "charactersCounter")
    public void countCharactersTest(char letter, int counter) {
        //given
        int expected = counter;
        //when
        int actual = countLetters(path).get(letter);
        //then
        assertEquals(expected, actual, "błędne liczenie znakow");
    }

    @DataProvider
    public Object[][] charactersCounter() {
        return new Object[][]{
                {'ł', 3},
                {'ę', 1},
                {'ś', 1},
                {'a', 7},
                {'b', 2},
                {'c', 1},
                {'d', 2},
                {'e', 7},
                {'f', 1},
                {'g', 3},
                {'h', 1},
                {'i', 8},
                {'k', 2},
                {'l', 2},
                {'n', 4},
                {'o', 2},
                {'p', 4},
                {'r', 4},
                {'ó', 1},
                {'s', 5},
                {'t', 4},
                {'u', 2},
                {'w', 2},
                {'y', 2},
                {'z', 5},
        };
    }

}