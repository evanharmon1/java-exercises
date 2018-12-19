package exercises;

import java.util.Scanner;

public class HelloExercise {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello, " + name);
        }
    }
