package day24_practices;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalDateArrayList {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1999, 2, 20);
        LocalDate date2 = LocalDate.of(1987, 10, 30);
        LocalDate date3 = LocalDate.of(1978, 3, 1);
        LocalDate date4 = LocalDate.of(2000, 12, 12);
        LocalDate date5 = LocalDate.of(2016, 11, 22);
        LocalDate date6 = LocalDate.of(2017, 7, 11);
        LocalDate date7 = LocalDate.of(2018, 5, 13);
        LocalDate date8 = LocalDate.of(2019, 9, 3);
        LocalDate date9 = LocalDate.of(2020, 12, 29);
        LocalDate date10 = LocalDate.of(2022, 12, 5);


        ArrayList<LocalDate> localDates = new ArrayList<>();
        localDates.addAll(Arrays.asList(date1, date2, date3, date4, date5, date6, date7, date8, date9, date10));

        localDates.removeIf(p -> p.isBefore( LocalDate.of(2016,8,15) ));

        System.out.println(localDates);


    }
}
