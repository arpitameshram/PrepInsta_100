import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        int num; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number to check  "); 
        num = sc.nextInt(); 
        boolean isPrime = true; // Assume the number is prime by default.

        // Check if the entered number is less than or equal to 1.
        if (num <= 1) {
            isPrime = false; // If the number is 1 or less, it's not prime.
        } else {
            // Iterate through divisors starting from 2 up to the square root of 'num'.
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) // In other words, it checks if there is no remainder when num is divided by i. If there's no remainder, it means that i is a divisor of num
                {
                    isPrime = false; // If 'num' is divisible by 'i', it's not prime.
                    break; // Break out of the loop, no need to continue checking.
                }
            }
        }

        // Check the 'isPrime' flag to determine and display whether the number is prime or not.
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
