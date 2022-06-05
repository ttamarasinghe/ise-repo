package com.ise.test;

public class MainTest {
    public static void main(String[] args) {
        CategoryOneTest categoryOneTest = new CategoryOneTest();
        categoryOneTest.testReturnUppercaseWhenLowercaseInput();
        categoryOneTest.testReturnLowercaseWhenUppercaseInput();
        categoryOneTest.testReturnNumbersWhenStringInput();
    }
}
