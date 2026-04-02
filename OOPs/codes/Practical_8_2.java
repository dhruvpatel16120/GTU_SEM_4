package OOPs.codes;

/* Practical No: 8.2
Title: File Handling - Write and Read Student Records

Practical Statement:
- Create file: students.txt
- Write at least 3 student records (roll, name, marks)
- Read file and display content
- Handle IOException using try-catch-finally
*/

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Practical_8_2 {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Writing to file
            fw = new FileWriter("students.txt");

            fw.write("101 Dhruv 85\n");
            fw.write("102 Rahul 78\n");
            fw.write("103 Priya 92\n");

            System.out.println("Data written to file successfully.\n");

            fw.close(); // close after writing

            // Reading from file
            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}