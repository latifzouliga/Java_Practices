package day25_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {

    public static void main(String[] args) {

        Offer offer1 = new Offer("Pittsburgh PA", "Car Automation", "SDET", 120000, true, true, true, true);
        Offer offer2 = new Offer("New Jersey", "Software future", "QA", 110000, true, false, false, false);
        Offer offer3 = new Offer("Union town PA", "softCo", "Automation", 130000, true, true, false, true);
        Offer offer4 = new Offer("California", "GoGo", "C# Developer", 100000, true, true, true, true);
        Offer offer5 = new Offer("Virginia", "Mobile Soft", "QA Automation", 90000, false, false, false, false);
        Offer offer6 = new Offer("Washington DC", "Hello Wolrd", "Java Developer", 85000, true, false, true, false);
        Offer offer7 = new Offer("Penn Hills PA", "Bingo CO", "JavaScript Developer", 80000, true, true, true, true);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println("Full time offers\n"+fullTimeOffers);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.location.endsWith("PA"));
        System.out.println("Local offers\n"+localOffers);

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p -> p.hasBenefit == false || p.hasPTO == false);
        System.out.println("Offers with benefits\n"+offersWithBenefits);

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));
        devOffers.removeIf(p -> !p.jobTitle.contains("Developer"));
        System.out.println("Dev offers\n"+devOffers);

        ArrayList<Offer> with100K = new ArrayList<>(Arrays.asList(myOffers));
        with100K.removeIf(p -> p.salary < 100000);
        System.out.println("Offers with 100k and over\n"+with100K);






    }


}
