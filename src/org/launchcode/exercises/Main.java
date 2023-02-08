package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", null);
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        for (Map.Entry entry : studentFiles.entrySet()) {
            CheckFileExtension((String) entry.getValue());
        }

    }

    public static double Divide(int x, int y)
    {
        try {
            if (y == 0.0) {
                throw new ArithmeticException ("Cannot divide by zero.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (double) x / y;
    }


    public static int CheckFileExtension(String fileName)
    {

        String[] fileNameParts = fileName.split("/.");

        String fileExtension = fileNameParts[fileNameParts.length - 1];

        try {
            if (fileExtension.equals("")) {
                throw new IllegalArgumentException("String cannot be empty.");
            }

            if (Objects.isNull(fileExtension)) {
                throw new NullPointerException("filename cannot be null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

        if (fileExtension.equals("java")) {
            return 1;
        }

        return 0;
    }

}
