package org.launchcode.java.studios;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class CountingCharacters {

    public static void main(String[] args) throws Exception {

//        Code to enable user input for text analysis below:
    //        Scanner in = new Scanner(System.in);
    //        System.out.println("Enter text you want to analyze");
    //        String inputString = in.nextLine();
    //        char[] charactersInString = inputString.toLowerCase().toCharArray();

        File file = new File("/Users/evan/Dropbox/Programming/Projects/Java Exercises/src/org/launchcode/java/studios/warandpeace.txt");
        Scanner sc = new Scanner(file);

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        while (sc.hasNextLine()) {
            String inputString = sc.nextLine();
            char[] charactersInString = inputString.toLowerCase().toCharArray();
            for (char character : charactersInString) {
                if (isLetter(character)) {
                    if (characterCounts.get(character) == null) {
                        characterCounts.put(character, 1);
                    } else {
                        characterCounts.put(character, (characterCounts.get(character) + 1));
                    }
                }
            }
        }
        System.out.println(characterCounts);
    }
}