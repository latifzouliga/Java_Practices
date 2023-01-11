package day03_practices;

/*
1. Create a class named Rectangle.java
2. Declare the following variables:
            1. width
            2. Length

        3. Write a program that can display the area of the rectangle
             Hints: area = width * length

 */

public class Rectangle {

    public static void main(String[] args) {

        int width = 10,
            length = 20,
            area = width * length;

        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("Rectangle area = " + area);
        System.out.println("------------------------------");
        System.out.println("\t\t\t"+length+ "\n\t_________________\n\t|               |\n\t|               |\t"+width +
                "\n\t|               |\n\t_________________");
        System.out.println("-------------------------------");




    }


}
