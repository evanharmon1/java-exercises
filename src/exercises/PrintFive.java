// Launchcode Class 3.2 Prep 2
// Write a static method to print out each word in a list that has exactly 5 letters.

package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintFive {
    private static ArrayList<String> list = new ArrayList<>(Arrays.asList("jungle", "forest", "glitter bomb", "biome", "taiga"));

    public static void main(String[] args) {
        for (String word : list) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
