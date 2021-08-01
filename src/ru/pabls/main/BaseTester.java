package ru.pabls.main;

public abstract class BaseTester {

    protected  void log(String methodName, String result) {
        String title = "------ " + methodName + " ------\n";
        String divider = "-------------------------------------";
        System.out.println(title + result + "\n" + divider);
    }
}