package ru.pabls.main;

import ru.pabls.main.IntroLesson;
import ru.pabls.main.BaseTester;
import java.util.*;

public class IntroLessonTester extends BaseTester {

    public void test() {
        IntroLesson introLesson = new IntroLesson();
        testFirstTask(introLesson);
        isOnlyDigits(introLesson);
        getCountOfVowelsAndConsonants(introLesson);
    }

    private void testFirstTask(IntroLesson introLesson) {
        String methodName = "numberOfRepeatedChars";
        Map<Character, Integer> res = introLesson.numberOfRepeatedChars("");
        if(res.isEmpty()) {
            super.log(methodName, " no repeated chars");
        } else {
            super.log(methodName, res.toString());
        }
    }

    private void isOnlyDigits(IntroLesson introLesson) {
        String methodName = "isOnlyDigits";
        boolean res = introLesson.isOnlyDigits("222222w2");
        if(res) {
            super.log(methodName, "yes");
        } else {
            super.log(methodName, "no");
        }
    }

    private void getCountOfVowelsAndConsonants(IntroLesson introLesson) {
        String methodName = "getCountOfVowelsAndConsonants";
        Map<String, Integer> res = introLesson.getCountOfVowelsAndConsonants("artek");
        super.log(methodName, "artek has " + res.toString());
    }
}