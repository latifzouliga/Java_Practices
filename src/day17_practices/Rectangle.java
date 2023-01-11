package day17_practices;

public class Rectangle {

    public double length;
    public double width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "lenght=" + length +
                ", width=" + width +
                '}';
    }

    public double calculateArea(){


        return length * width;


    }

    public double calculatePerimeter(){


        double perimeter;
        perimeter = 2*length + 2*width;
        return perimeter;

    }



}
/*
3. create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object

 */