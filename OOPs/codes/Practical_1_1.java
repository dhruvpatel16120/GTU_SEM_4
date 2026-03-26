package OOPs.codes;

/* Practical No: 1.1 
Title: Meter to Feet Conversion 
Practical Statement: Develop a Java program that prompts the user to enter a distance in meters. The program should convert this distance to feet (1 meter = 3.28084 feet)
 and display the result formatted to two decimal places. */ 
 import java.util.Scanner; 
 public class Practical_1_1  { 
    public static void main(String[] args) {
    // Taking input from user 
         Scanner sc = new Scanner(System.in); 
         System.out.print("Enter distance in meters: "); 
         double meters = sc.nextDouble(); 
         
         // Conversion formula 
         double feet = meters * 3.28084; 

         // Display result with two decimal places 
         System.out.printf("Distance in feet: %.2f", feet);
        
         sc.close(); 
        } 
    }
