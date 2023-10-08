package day19_array;

public class ArrayReversedNames {

    public static void main(String[] args) {

        String[] classMates = {"Kakanou Fotie", "Abdellatif Zouliga", "Jeremy Stewart", "Yessef Acikgoz", "Radoslaw Pawlowski", "Aziz Akhunvaev", "Cristina Guranda", "Dilvin Uncuoglu", "Ahlam Hajjai", "Lamya Zouliga"};

        //String[] reversed = new String[classMates.length];

        for (int i = 0; i < classMates.length; i++) {

            //reversed[i] = "";
            String reversed = "";
            for (int j = classMates[i].length() - 1; j >= 0; j--) {
                char ch = classMates[i].charAt(j);
                //reversed[i] += ch; // assign reversed name to result array
                reversed += ch;

            }
            System.out.println(reversed); // print statement needs to be places inside loop inorder to print one name at a time
        }
        // prints reversed name in an array
        //System.out.println(Arrays.toString(reversed));



    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */