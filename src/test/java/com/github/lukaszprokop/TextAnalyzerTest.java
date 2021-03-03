package com.github.lukaszprokop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static com.github.lukaszprokop.TextAnalyzer.*;

import static org.testng.Assert.*;

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
        double expected = 5.2d;
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

    @Test
    public void countCharactersTest() {
        //given
        Map<Character, Integer> expected = new HashMap<>(Map.of('ł', 3, 'ę', 1, 'ś', 1, 'a', 7,
                'b', 2, 'c', 1, 'd', 2, 'e', 7, 'f', 1, 'g', 3));
        expected.put('h', 1);
        expected.put('i', 8);
        expected.put('k', 2);
        expected.put('l', 2);
        expected.put('n', 4);
        expected.put('o', 2);
        expected.put('p', 4);
        expected.put('r', 4);
        expected.put('ó', 1);
        expected.put('s', 5);
        expected.put('t', 4);
        expected.put('u', 2);
        expected.put('w', 2);
        expected.put('y', 2);
        expected.put('z', 5);
        //when
        Map<Character, Integer> actual = countCharacters(path);
        //then
        assertEquals(expected, actual, "błędne liczenie znakow");
    }

}