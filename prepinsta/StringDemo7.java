import java.util.Scanner;

class StringDemo7 {
    public static void main(String args[]) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the original string and read it
        System.out.println("Original String: ");
        String s1 = sc.nextLine();

        // Initialize an empty string to store the reversed string
        String reversed = "";

        // Iterate through the original string character by character in reverse order
        for (int i = s1.length() - 1; i >= 0; i--) //length() method is a built-in method nd -1 is for backword
		{
            // Get the character at the current position (i)
            char ch = s1.charAt(i);

            // Append the character to the 'reversed' string
            reversed += ch;
        }

        // Print the reversed string
        System.out.println("Reversed: " + reversed);
    }
}
