package day34_practices.deviceTask;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPhoneObjects {

    public static void main(String[] args) {

        //======================================= Phone Objects =========================================

        Iphone iphone = new Iphone("14", 1100, "Black", "Max", true, true);

        Samsung samsung = new Samsung("Galaxy", 1000, "Blue", "Medium", true, true);

        Google google = new Google("Pixel", 900, "Gray", "Small", true, true);

        // Phone ArrayList
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(iphone, samsung, google));

        //============================================== Computer Objects =====================================

        Laptop laptop = new Laptop("Apple ","MacBook Pro",1500,"Gray","13",true,true,"McOS",500,8);

        PersonalComputer personalComputer = new PersonalComputer("Asus","X123",750,"White","15",true,true,"Windows 10",250,16);

        Desktop desktop = new Desktop("Acer","Aspire",1500,"Black","Large",false,true,"Ubuntu",750,32,true);
        System.out.println(laptop);
        System.out.println(personalComputer);
        System.out.println(desktop);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        laptop.showInfo();
        System.out.println("-------------------------");
        personalComputer.showInfo();
        System.out.println("-----------------------");
        desktop.showInfo();
        System.out.println("-------------------------");

        // An array for Phone and Computer Objects
        Device[] devices = phones.toArray(new Device[0]);




        //===================================== Testing Phone Objects ====================================
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(google);

        System.out.println("-------------------------------------------------");
        iphone.call(412343999);
        samsung.call(343454454);
        google.call(234111000);

        System.out.println("----------------------------------------------------");

        iphone.turnOn();
        samsung.turnOn();
        google.turnOn();




    }
}
