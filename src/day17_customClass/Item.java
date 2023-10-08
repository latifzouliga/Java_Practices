package day17_customClass;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;


    public void SetInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }




    public double calcCost(){

          return unitPrice * quantity;



    }

    public void showCost(){
        System.out.println("The total price is for "+name+" is: $"+calcCost());

    }



    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
