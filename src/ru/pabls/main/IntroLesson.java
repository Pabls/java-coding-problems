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
}