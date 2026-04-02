package OOPs.codes;

/* Practical No: 8.3
Title: File Analysis (Lines, Words, Characters)

Practical Statement:
- Read file: data.txt
- Count:
    Lines
    Words
    Characters (excluding spaces & newline)
- Use FileReader and BufferedReader
- Handle FileNotFoundException and IOException
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practical_8_3 {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                lineCount++;

                // Count words
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                // Count characters (excluding spaces)
                String noSpace = line.replaceAll("\\s+", "");
                charCount += noSpace.length();
            }

            br.close();

            // Output
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}