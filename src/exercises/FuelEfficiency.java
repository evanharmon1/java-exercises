package exercises;

import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        Float miles = in.nextFloat();
        System.out.println("How many gallons of gas did you use?");
        Float gallons = in.nextFloat();
        Float mpg = miles / gallons;
        System.out.println("Your mpg was " + mpg);
    }
}
