package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter length");
    Float length = in.nextFloat();
    System.out.println("Enter width");
    Float width = in.nextFloat();
    Float area = length * width;
    System.out.println(area);
    }
}
