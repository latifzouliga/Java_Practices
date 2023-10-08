package day19_array;

public class classmates {

    public static void main(String[] args) {

     String[] classMates = {"Kakanou Fotie", "Abdellatif Zouliga", "Jeremy Stewart", "Yessef Acikgoz", "Radoslaw Pawlowski", "Aziz Akhunvaev", "Cristina Guranda", "Dilvin Uncuoglu", "Ahlam Hajjai", "Lamya Zouliga"};

       String[] init = new String[10];

        for (int i = 0; i < classMates.length; i++) {

            init[i] = classMates[i].substring(0,1) + classMates[i].substring(classMates[i].indexOf(" ")+1,classMates[i].indexOf(" ")+2);
            System.out.println(init[i]);
        }





    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */