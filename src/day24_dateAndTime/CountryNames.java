package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {

    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.addAll(Arrays.asList("Afghanistan", "Madagascar", "Angola",  "Mali", "Bamgladish",
                "Mexico", "Australia", "Portugal", "Cuba", "Romania",  "Rwanda", "Philippines", "Code d'Ivoire",
                "Egypt", "Ecuador", "New Zealand", "Netherlands", "Mozambique", "Montenegro"));

        countryNames.removeIf(p -> p.length() >= 10);
        System.out.println(countryNames);


    }
}
