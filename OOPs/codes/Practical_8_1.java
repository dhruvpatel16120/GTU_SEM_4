package OOPs.codes;

/* Practical No: 8.1
Title: Count Characters, Words, and Lines in a File

Practical Statement:
- File name passed via command-line argument
- Count:
    Characters
    Words (separated by whitespace)
    Lines
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practical_8_1 {
    public static void main(String[] args) {

        // Check argument
        if (args.length < 1) {
            System.out.println("Please provide file name as argument");
            return;
        }

        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                lineCount++;

                // Count characters
                charCount += line.length();

                // Count words
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            // Output
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}