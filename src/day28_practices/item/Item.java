package day28_practices.item;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {


        if (name.isBlank() || name.isEmpty()) {
            System.err.println("Invalid name.\nName can not be blank or empty");
            System.exit(1);
        }

        for (char each : name.replace(" ","").toCharArray()) {
            if( !Character.isLetterOrDigit(each)){
                System.err.println("Invalid name: "+ name);
                System.exit(1);
            }

            if(Character.isDigit(name.charAt(0))){
                System.err.println("Name does not start with letter, instead it starts with: " + name.charAt(0));
                System.exit(1);
            }

            this.name = name;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0){
            System.err.println("Invalid unit price: "+unitPrice);
            System.exit(1);
        }

        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        if (name.equalsIgnoreCase("toilet paper")){
            System.err.println("toilet paper quantity can not be more than 1");
            return quantity = 1;
        }
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0 ){
            System.err.println("Invalid quantity: "+ quantity);
            System.exit(1);
        }
        if (name.equalsIgnoreCase(" toilet paper")){
            quantity = 1;
        }

        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }



    @Override
    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", unitPrice=$" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ", total$" + calcCost()+
                '}';
    }
}
