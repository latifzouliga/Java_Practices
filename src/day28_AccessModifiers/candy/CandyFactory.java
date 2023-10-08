package day28_AccessModifiers.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy c1 = new Candy("Snickers",1,12,false);

        System.out.println(c1);

        ArrayList<Candy> candy = new ArrayList<>(Arrays.asList(
                new Candy("M&M",20,50,false),
                new Candy("Reese's",23,65,true),
                new Candy("Whoppers",30,45,false),
                new Candy("York",30,55,false),
                new Candy("Crunch",70,85,true)
        ));

        for (Candy each : candy) {
            System.out.println(each.getBrand()+" : $"+each.getPrice());
        }


    }
}
