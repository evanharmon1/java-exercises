package org.launchcode.java.studios;

// the area of a circle is A = pi * r * r where pi is 3.14 and r is the radius.

import java.util.Scanner;

public class Area {
    static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double radius;
        do {
            System.out.println("Enter the radius");
            radius = in.nextDouble();
            if (radius < 0) {
                System.out.println("Can't be negative");
            }
        } while (radius < 0);
        Double area = PI * radius * radius;
        System.out.println(area);
    }
}
