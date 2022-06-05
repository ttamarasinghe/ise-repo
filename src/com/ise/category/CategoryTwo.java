package com.ise.category;

import java.io.*;
import java.util.Scanner;

public class CategoryTwo extends Category {
    public void executeCategory() {
        System.out.println("Please enter the length");
        Scanner optionalScanner = new Scanner(System.in);
        double length = optionalScanner.nextDouble();

        System.out.println("Please enter the unit you want to convert to");
        System.out.println("1: Meters");
        System.out.println("2: Feet");

        int unitType;
        unitType = optionalScanner.nextInt();

        String fileContent = "Length:" + length + "\nUnit Type:" + unitType;
        writeToFile(fileContent);
        String content = readFile();
        String [] contentLines = content.split("\n");
        String [] lengthLines = contentLines[0].split(":");
        String [] unitLines = contentLines[1].split(":");

        int parseUnitType = Integer.parseInt(unitLines[1]);
        double parsedLength = Double.parseDouble(lengthLines[1]);

        switch (parseUnitType) {
            case 1:
                convertToMeters(parsedLength);
                break;
            case 2:
                convertToFeet(parsedLength);
                break;
            default:
                System.out.println("Invalid selection");
        }
    }

    private void convertToFeet(double length) {
        System.out.println("Converted value");
        System.out.println(Math.round(length * 3.281) + "ft");
    }

    private void convertToMeters(double length) {
        System.out.println("Converted value");
        System.out.println(Math.round(length / 3.28) + "m");
    }

    private void writeToFile(String content) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("input.text"));
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile() {
        String currentLine = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.text"));
            currentLine = reader.readLine();
            currentLine = currentLine + "\n" + reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currentLine;
    }
}
