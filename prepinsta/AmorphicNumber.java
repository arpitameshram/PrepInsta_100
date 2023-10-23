//An Automorphic Number, also known as a Circular Number, is a number that remains the same when its square is appended to it. For example, 5 is an Automorphic Number because 5^2 = 25, and 25 is found at the end of 5.
import java.util.Scanner; // Import the Scanner class for user input

class AmorphicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object for input
        int i, n, sq, c = 0;

        System.out.println("Enter a number to check for Automorphic Number");
        n = in.nextInt(); // Read the user's input as an integer
        sq = n * n; // Calculate the square of the input number

        for (i = n; n > 0; n = n / 10) {
            // Iterate through the digits of the input number
            if (n % 10 == sq % 10)
                c++; // If the last digit of the input and square match, increment the count
            sq = sq / 10; // Move to the next digit of the square
        }

        if (c > 0)
            System.out.println("Automorphic Number"); // If count is greater than 0, it's an Automorphic Number
        else
            System.out.println("Not an Automorphic Number"); // If count is 0, it's not an Automorphic Number
    }
}
