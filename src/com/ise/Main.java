package com.ise;

import com.ise.category.Category;
import com.ise.category.CategoryOne;
import com.ise.category.CategoryTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please select a category");
        System.out.println("1: Category 1");
        System.out.println("2: Category 2");
        int categorySelection;

        Scanner categoryScanner = new Scanner(System.in);
        categorySelection = categoryScanner.nextInt();

        if (categorySelection == 1) {
            Category category = new CategoryOne();
            category.executeCategory();
        } else if (categorySelection == 2) {
            Category category = new CategoryTwo();
            category.executeCategory();
        } else {
            System.out.println("Invalid category");
        }
    }
}
