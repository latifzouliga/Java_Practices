package day21_multiDemensionalArray;

public class batch1Groups {

    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Goups = new String[3][];
        batch1Goups[0] = batch1Group1;
        batch1Goups[1] = batch1Group2;
        batch1Goups[2] = batch1Group3;

        //System.out.println(Arrays.deepToString(batch1Goups));

        System.out.println("-------------------------------------------------------------------------");

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups = new String[3][];
        batch2Groups[0] = batch2Group1;
        batch2Groups[1] = batch2Group2;
        batch2Groups[2] = batch2Group3;

        //System.out.println(Arrays.deepToString(batch2Groups));

        String[][][]  CydeoGroups = new String[2][][];
        CydeoGroups[0] = batch1Goups;
        CydeoGroups[1] = batch2Groups;

        for (String[][] batchGroups : CydeoGroups) {
            for (String[] groups : batchGroups) {
                for (String eachStudents : groups) {
                    String init = eachStudents.charAt(0)+".";
                    System.out.println(init + " "+eachStudents);
                }
            }
        }







    }
}
/*
1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

		2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group1 to each indexes
				 of the variable batch1Groups

        3. given the following arrays:
            String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
            String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
            String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students
 */