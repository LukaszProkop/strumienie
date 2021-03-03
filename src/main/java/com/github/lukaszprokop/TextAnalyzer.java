package com.github.lukaszprokop;

import java.util.Map;

class TextAnalyzer {

    public static void main(String[] args) {

        String path = "src/main/resources/text.txt";

        System.out.printf("\nNajdluzszy wyraz: %s\n", longestWord(path));

        System.out.printf("\nSrednia ilosc liter w wyrazach: %.1f\n", averageLetterNumberInWords(path));

        System.out.printf("\nIlosc wyrazow w pliku: %d\n", countWords(path));

        System.out.println("\nWystąpienia liter:");
        countCharacters(path).forEach((character, integer) -> System.out.printf("%c: %d\n", character, integer));

    }

    public static String longestWord(String inputPath) {
        /* TODO: Dodaj swoja implementację korzystając ze Strumieni i wykonaj przygotowane testy testy.
            Nie zmieniaj synatury metody.*/
    }

    public static double averageLetterNumberInWords(String inputPath) {
        /* TODO: Dodaj swoja implementację korzystając ze Strumieni i wykonaj przygotowane testy testy.
            Nie zmieniaj synatury metody oraz testów.*/
    }

    public static long countWords(String inputPath) {
        /* TODO: Dodaj swoja implementację korzystając ze Strumieni i wykonaj przygotowane testy testy.
            Nie zmieniaj synatury oraz testów.*/
    }

    public static Map<Character, Integer> countCharacters(String inputPath) {
        /* TODO: Dodaj swoja implementację korzystając ze Strumieni i wykonaj przygotowane testy testy.
            Nie zmieniaj synatury oraz testów.*/
    }
}
