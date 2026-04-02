package OOPs.codes;

/* Practical No: 8.4
Title: File Operations using Command-Line Arguments

Practical Statement:
- Perform operations using command-line:
    copy source dest
    delete filename
    rename oldname newname
- Display file properties after operation
*/

import java.io.*;
import java.util.Date;

public class Practical_8_4 {

    // Method to display file properties
    public static void showFileProperties(File file) {
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        System.out.println("\n--- File Properties ---");
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last Modified: " + new Date(file.lastModified()));
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("copy source.txt dest.txt");
            System.out.println("delete file.txt");
            System.out.println("rename old.txt new.txt");
            return;
        }

        String command = args[0];

        try {

            // COPY
            if (command.equalsIgnoreCase("copy")) {

                if (args.length < 3) {
                    System.out.println("Provide source and destination file.");
                    return;
                }

                File source = new File(args[1]);
                File dest = new File(args[2]);

                BufferedReader br = new BufferedReader(new FileReader(source));
                BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }

                br.close();
                bw.close();

                System.out.println("File copied successfully.");
                showFileProperties(dest);
            }

            // DELETE
            else if (command.equalsIgnoreCase("delete")) {

                File file = new File(args[1]);

                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Failed to delete file.");
                }
            }

            // RENAME
            else if (command.equalsIgnoreCase("rename")) {

                if (args.length < 3) {
                    System.out.println("Provide old and new file name.");
                    return;
                }

                File oldFile = new File(args[1]);
                File newFile = new File(args[2]);

                if (oldFile.renameTo(newFile)) {
                    System.out.println("File renamed successfully.");
                    showFileProperties(newFile);
                } else {
                    System.out.println("Rename failed.");
                }
            }

            else {
                System.out.println("Invalid command.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}