package com.ise.category;

import java.util.Scanner;

public class CategoryOne extends Category {
    public void executeCategory() {
        System.out.println("Please input a String");
        System.out.println("1: Convert to Lower and Upper case");
        System.out.println("2: Identify Numeric String");
        System.out.println("3: String valid number or not");
        System.out.println("4: Remove numeric");

        int optionalSelection;
        Scanner optionalScanner = new Scanner(System.in);
        optionalSelection = optionalScanner.nextInt();

        System.out.println("Please input a String");
        String selectionInput;
        Scanner stringScanner = new Scanner(System.in);
        selectionInput = stringScanner.nextLine();

        System.out.println("-------------");
        System.out.println();

        String upperCase = null;
        String lowerCase = null;
        switch (optionalSelection) {
            case 1:
                upperCase = convertToUppercase(selectionInput);
                System.out.println(upperCase);
                lowerCase = convertToLowercase(selectionInput);
                System.out.println(lowerCase);
                break;
            case 2:
                String numericString = getNumeric(selectionInput);
                System.out.println(numericString);
                break;
            case 3:
                isValidNumber(selectionInput);
                break;
            case 4:
                String numericRemoveString = removeNumeric(selectionInput);
                upperCase = convertToUppercase(numericRemoveString);
                System.out.println(upperCase);
                lowerCase = convertToLowercase(numericRemoveString);
                System.out.println(lowerCase);
            default:
                System.out.println("Invalid selection");

        }
    }

    public String convertToUppercase(String selectionInput) {
        return selectionInput.toUpperCase();
    }

    public String convertToLowercase(String selectionInput) {
        return selectionInput.toLowerCase();
    }

    public String getNumeric(String selectionInput) {
        String numericString = "";
        for (char character : selectionInput.toCharArray()) {
            try {
                int number = Integer.parseInt(String.valueOf(character));
                numericString = numericString + number;
            } catch (NumberFormatException ex) {
            }
        }
        return numericString;
    }

    public void isValidNumber(String selectionInput) {
        try {
            int number = Integer.parseInt(selectionInput);
            System.out.println(number + " is a number");

        } catch (NumberFormatException ex) {
            System.out.println("Not a number");
        }
    }

    public String removeNumeric(String selectionInput) {
        StringBuilder numericRemoveString = new StringBuilder();
        for (char character : selectionInput.toCharArray()) {
            try {
                Integer.parseInt(String.valueOf(character));
            } catch (NumberFormatException ex) {
                numericRemoveString.append(character);
            }
        }
        return numericRemoveString.toString();
    }
}
