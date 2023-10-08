package day21_multiDemensionalArray;

public class ILoveArray {

    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        String result = "";

        for (String[][][][][][][][][] array9 : array) {
            for (String[][][][][][][][] array8 : array9) {
                for (String[][][][][][][] array7 : array8) {
                    for (String[][][][][][] array6 : array7) {
                        for (String[][][][][] array5 : array6) {
                            for (String[][][][] array4 : array5) {
                                for (String[][][] array3 : array4) {
                                    for (String[][] array2 : array3) {
                                        for (String[] array1 : array2) {
                                            for (String each : array1) {
                                                result += each+" ";
                                                System.out.println(each);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("---------------------");
        System.out.println(result);


    }
}

/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each elements of the given array


 */