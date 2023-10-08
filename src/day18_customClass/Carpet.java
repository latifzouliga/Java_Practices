package day18_customClass;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }



    public Carpet() {

    }


    public double calcCost(double width, double length, double unitPrice) {

        double total = 0;

        total = (width * length) * unitPrice;

       if(isPersian){
           total+= 200;
       }
        return total;

    }

    public void showTotal(){

        if (isPersian){
            System.out.println("Persian carpet total price is: $"+ calcCost(width,length,unitPrice));
        }else {
            System.out.println("Carpet total price is: $"+ calcCost(width,length,unitPrice));
        }

    }



    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }


}
