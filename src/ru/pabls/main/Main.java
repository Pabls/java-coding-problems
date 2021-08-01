package ru.pabls.main;
import java.util.*;

import ru.pabls.main.IntroLessonTester;


class Main {
    public  static void main(String[] args) {
        testIntroLesson();
    }

    private static void testIntroLesson() {
        IntroLessonTester tester = new IntroLessonTester();
        tester.test();
    }
}