package day18_practices;

public class CapetTest {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();

        carpet1.setInfo(15,25,10,true);

        double latifCarpet = carpet1.calcCost(carpet1.width, carpet1.length, carpet1.unitPrice);

        carpet1.showTotal();

        System.out.println("--------------------------------------------------------------------");

        System.out.println("Total price is: $"+latifCarpet);



    }
}
