package day25_practices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMovieObjects {

    public static void main(String[] args) {

        Movie move1 = new Movie("USA","Java Developer: Zero to Hero","Adventure," +
                " Comedy, Thriller","Kuzzat Altay",LocalDate.of(2021,4,18),
                new ArrayList<>(Arrays.asList("Ali", "Mohammed", "Lamya")));

        System.out.println(move1);




    }
}
