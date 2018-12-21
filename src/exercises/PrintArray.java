// Launchcode Class 3.2 Prep 3
//Arrays: Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8. Then loop through the array and print out each value.

package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
