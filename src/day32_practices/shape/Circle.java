package day32_practices.shape;



public class Circle extends Shapes{

    private double radius;


    public static final double pi = 3.14;

    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println("Invalid number: "+ radius+"\nRadius can not be zero or negative");
            System.exit(1);
        }
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public void draw() {
        System.out.println("            ***         ");
        System.out.println("      *             *      ");
        System.out.println("   *                   *     ");
        System.out.println("  *                     *     ");
        System.out.println("  *          |          *     ");
        System.out.println("   *         |         *     ");
        System.out.println("      *      |      *     ");
        System.out.println("            ***         ");
        System.out.println("           "+radius);



    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                "--> | radius: " + df.format(radius) +
               super.toString();
    }
}
