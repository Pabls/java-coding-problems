package ru.pabls.main;
import java.util.*;

import ru.pabls.main.IntroLesson;


class Main {
    public  static void main(String[] args) {
        testIntroLesson();
    }

    private static void testIntroLesson() {
        IntroLesson introLesson = new IntroLesson();
        testFirstTask(introLesson);
    }

    private static void testFirstTask(IntroLesson introLesson) {
        String methodName = "numberOfRepeatedChars";
        Map<Character, Integer> res = introLesson.numberOfRepeatedChars("");
        if(res.isEmpty()) {
            log(methodName, " no repeated chars");
        } else {
            log(methodName, res.toString());
        }
    }

    private static void log(String methodName, String result) {
        String title = "------ " + methodName + " ------\n";
        String divider = "-------------------------------------";
        System.out.println(title + result + "\n" + divider);
    }
}