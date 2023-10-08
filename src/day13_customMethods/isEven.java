package day13_customMethods;

public class isEven {

    public static void main(String[] args) {

        int num = 11;
        System.out.println(isEven(num));



    }

    public static boolean isEven(int number){

       return !isOdd.isOdd(number);  // giving the path for isOdd, it is not imported because it is still in the same package



    }

}
/*
2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false

 */