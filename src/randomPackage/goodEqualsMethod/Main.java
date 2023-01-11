package randomPackage.goodEqualsMethod;

// Driver class to test the Complex class
public class Main {

    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }

        System.out.println(Double.compare(10, 20));

        System.out.println(Double.max(10, 50));
        //Math.max()
    }
}
