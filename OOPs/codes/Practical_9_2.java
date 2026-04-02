package OOPs.codes;

/* Practical No: 9.2
Title: Word Frequency using HashMap

Practical Statement:
- Take a sentence from user
- Count frequency of each word using HashMap<String, Integer>
- Display result in required format
*/

import java.util.HashMap;
import java.util.Scanner;

public class Practical_9_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Split into words
        String[] words = input.split("\\s+");

        // HashMap to store frequency
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Display result
        System.out.println("\nWord Frequency:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        sc.close();
    }
}