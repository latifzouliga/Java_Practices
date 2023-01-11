package day06_practices;

public class Cigarettes {
    public static void main(String[] args) {

        int age = 133;

        if(age >= 20 && age <= 100){
            System.out.println("You are eligible to buy cigarettes");
        }
        if(age < 20 || age > 100)
            System.out.println("You are NOT eligible to buy cigarettes");
    }


}
/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that can check if the
   person is eligible to buy cigarettes
    Ex:
         age = 20

    output:
          You are not eligible to buy Cigarettes
 */