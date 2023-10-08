package day29_Encapsulation.phneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("Iphone", "13","Max","Black",10000);
        System.out.println(iphone);

        Samsung samsung1 = new Samsung();
        samsung1.setInfo("Samsung","Sam XM","Medium","White",900);
        System.out.println(samsung1);

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Nokia", "Grand","Small","Grey",700);
        System.out.println(nokia1);


    }

}
