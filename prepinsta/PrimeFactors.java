
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt(); // Read the user's input as an integer

        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.print(i + " "); // Print the prime factor
                num = num / i; // Update the number by dividing it by the prime factor
            }
        }

        if (num > 2) {
            System.out.println(num); // If the remaining number is greater than 2, it's also a prime factor
        }
    }
}

