package randomPackage.GoogleStuff;

@FunctionalInterface
interface MyInterface{
    int calculate(int a, int b);
}

public class DoubleColon {

    public static void main(String[] args) {


        MyInterface calc = DoubleColon::add;

        System.out.println(calc.calculate(3,3));

    }

    public static int add(int a, int b){
        return a + b;
    }
}
