package ru.pabls.main;

import java.util.*;

public class IntroLesson {

    /*
    * Подсчет повторяющихся символов.
    * Написать программу, которая подсчиты­вает повторяющиеся символы в заданной строке.
    */
    public Map<Character, Integer> numberOfRepeatedChars(String src) {
        Map<Character, Integer> result = new HashMap<Character, Integer>();

        if(src == null || src.trim().isEmpty()) {
            return result;
        }
        char[] characters = src.toCharArray();

        for(int i = 0; i < characters.length; i++) {
            Integer count = result.get(characters[i]);
            if(count != null) {
                result.put(characters[i], count + 1);
            } else {
                result.put(characters[i], 1);
            }
        }
        
        return result;
    }

    public boolean isOnlyDigits(String src) {
        boolean hasOnlyDdigits = false;
        if(src == null || src.trim().isEmpty()) {
            return hasOnlyDdigits;
        }

        char zero = '0';
        char nine = '9';
        char[] characters = src.toCharArray();
        for(int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            if(currentChar < zero || currentChar > nine) {
                hasOnlyDdigits = false;
                break;
            } else {
                hasOnlyDdigits = true;
            }
        }

        return hasOnlyDdigits;
    }

    public Map<String, Integer> getCountOfVowelsAndConsonants(String src) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        Map<String, Integer> result = new HashMap<String, Integer>();

        if(src != null && !src.trim().isEmpty()) {
            char[] vowelsChars = { 'a', 'e', 'i', 'o' , 'u' };
            char[] characters =  src.trim().toCharArray();
            for(char ch: characters) {
                for(int i = 0; i < vowelsChars.length; i++) {
                    if(ch == vowelsChars[i]) {
                        vowelsCount += 1;
                        break;
                    } else if(i == vowelsChars.length - 1) {
                        consonantsCount += 1;
                        break;
                    }
                }
            }
        }

        result.put("Vowels", vowelsCount);
        result.put("Consonants", consonantsCount);

        return result;
    }
}