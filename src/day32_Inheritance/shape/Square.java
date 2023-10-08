package day32_Inheritance.shape;

public class Square extends Shapes{

    private double side;

    public Square(double side) {
        super();
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            System.err.println("Invalid number: "+ side+ "\nSide can not be zero or negative");
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {

        System.out.println("\t*  *  *  *  *  *  *");
        for (int i = 0; i < 4; i++) {
            if (i == 2){
                System.out.println(getSide()+" *                 *");
            }
            System.out.println("\t*                 *");
        }
        System.out.println("\t*  *  *  *  *  *  *");
        System.out.println("\t\t\t"+getSide());

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                "--> | side: " + side +
               super.toString();
    }
}
