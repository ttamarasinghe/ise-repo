package com.ise.test;

import com.ise.category.CategoryOne;

public class CategoryOneTest {
    public void testReturnUppercaseWhenLowercaseInput() {
        String input = "hello";
        String expectedUpperOutput = "HELLO";
        CategoryOne categoryOne = new CategoryOne();
        String result = categoryOne.convertToUppercase(input);
        if (result.equals(expectedUpperOutput)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    public void testReturnLowercaseWhenUppercaseInput() {
        String input = "HELLO";
        String expectedLowerOutput = "hello";
        CategoryOne categoryOne = new CategoryOne();
        String result = categoryOne.convertToLowercase(input);
        if (result.equals(expectedLowerOutput)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    public void testReturnNumbersWhenStringInput(){
        String input = "12ABC255AC";
        String expectedOutput = "12255";
        CategoryOne categoryOne = new CategoryOne();
        String result = categoryOne.getNumeric(input);
        if (result.equals(expectedOutput)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }
}
