
import java.util.Scanner;

class StringDemo9 {
    public static void main(String args[]) {
        // Create a Scanner object to read user inputArpita
        Scanner sc1 = new Scanner(System.in);

        // Prompt the user to enter a string and read it
        System.out.println("Enter the String: ");
        String s1 = sc1.nextLine();

        // Convert the string to a character array
        char ch[] = s1.toCharArray();

        // Create a StringBuffer to build the modified string
        StringBuffer sb = new StringBuffer();

        // Iterate through the character array
        for (int i = 0; i < ch.length; i++) {
            // Check if the current character is not a space or a tab
            if ((ch[i] != ' ') && (ch[i] != '\t')) {
                // Append the character to the StringBuffer
                sb.append(ch[i]);
            }
        }

        // Print the string after removing spaces and tabs
        System.out.println("After removing space: " + sb);
    }
}
