import java.util.*;

class StringDemo10 {
    public static void main(String args[]) {
        // Define the input string
        String str = "ARPITAMESHRAM";

        // Create a HashMap to store character frequencies
        Map<Character, Integer> map = new HashMap<>();

        // Iterate through the characters in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char ch = str.charAt(i);

            // Check if the character is already in the map
            if (map.containsKey(ch)) {
                // If it's already in the map, increment the frequency
                map.put(ch, map.get(ch) + 1);
            } else {
                // If it's not in the map, add it with a frequency of 1
                map.put(ch, 1);
            }
        }

        // Print the map, which contains character frequencies
        System.out.println(map);
    }
}
