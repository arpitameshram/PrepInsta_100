
//An Armstrong number is a number that is equal to the sum of its own digits, each raised to the power of the number of digits in the number. 
import java.util.Scanner;

public class Armstrong1 {
   public static void main(String args[]) {
      int num1, num2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number ::");
      num1 = sc.nextInt();
      System.out.println("Enter the second number ::");
      num2 = sc.nextInt();

      for (int i = num1; i < num2; i++) {
         int check, rem, sum = 0;

         // 'check' stores the current number being checked
         check = i;

         // Initialize 'sum' to 0 for each new number
         while (check != 0) {
            // This line extracts the last digit (remainder when dividing by 10) from the number 'check'.
            rem = check % 10;

            // Calculate the sum of cubes of the digits
            sum = sum + (rem * rem * rem);

            // Remove the last digit from 'check'
            check = check / 10;
         }

         // Check if the sum of cubes is equal to the original number 'i'
         if (sum == i) {
            System.out.println(i + " is an Armstrong number.");
         }
      }
   }
}
