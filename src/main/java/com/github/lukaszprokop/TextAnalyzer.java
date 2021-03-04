package com.github.lukaszprokop;

import java.util.Map;

/* TODO: Dodaj swoja implementację metod korzystając ze Strumieni oraz wykonaj przygotowane testy.
    Nie zmieniaj synatury metod.*/

class TextAnalyzer {

    public static void main(String[] args) {

        String path = "src/main/resources/text.txt";

        System.out.printf("\nNajdluzszy wyraz: %s%n", longestWord(path));

        System.out.printf("\nSrednia ilosc liter w wyrazach: %.1f%n", averageLetterNumberInWords(path));

        System.out.printf("\nIlosc wyrazow w pliku: %d%n", countWords(path));

        System.out.println("\nWystąpienia liter:");
        countCharacters(path).forEach((character, integer) -> System.out.printf("%c: %d\n", character, integer));

    }

    static String longestWord(String inputPath) {
        /* TODO: Twoja implementacja*/
    }

    static double averageLetterNumberInWords(String inputPath) {
        /* TODO: Twoja implementacja*/
    }

    static long countWords(String inputPath) {
        /* TODO: Twoja implementacja*/
    }

    static Map<Character, Integer> countCharacters(String inputPath) {
        /* TODO: Twoja implementacja*/
    }
}
