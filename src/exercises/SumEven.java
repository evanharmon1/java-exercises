// Launchcode Class 3.2 Prep 1
// ArrayList: Write a static method to find the sum of all the even numbers in a list. Within main, create a list with at least 10 integers and call your method on the list.

package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class SumEven {
    public static int returnSumEven(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(returnSumEven(numbers));
    }
}