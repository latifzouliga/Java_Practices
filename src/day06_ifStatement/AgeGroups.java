package day06_ifStatement;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 66;
        if(age > 0 && age <= 2){ // 1 -2
            System.out.println("Infant");
        }
        if(age >= 3 && age <= 5){ // 3 - 5
            System.out.println("Toddler");
        }
        if(age >= 6 && age <= 9){  // 6 - 9
            System.out.println("Kid");
        }
        if(age >= 10 && age <= 12){  // 10 - 12
            System.out.println("Pre-teen");
        }
        if(age >= 13 && age <= 17){  // 13 - 17
            System.out.println("Teenager");
        }
        if(age >= 18 && age <= 20){  // 18 - 20
            System.out.println("Young Adult");
        }
        if(age >= 21 && age <= 39){  // 21 - 39
            System.out.println("Adult");
        }
        if(age >= 40 && age <= 49){  // 40 - 49
            System.out.println("Young Middle-Aged Adult");
        }
        if(age >= 50 && age <= 54){  //  50 - 54
            System.out.println("Middle-Aged-Adult");
        }
        if(age >= 55 && age <= 64){ // 55 - 64
            System.out.println("very Young Senior Citizen");
        }
        if(age >= 65 && age <= 74){  // 65 - 74
            System.out.println("Young Senior Citizen");
        }
        if(age >= 75 && age <= 84){  //  75 - 84
            System.out.println("Senior Citizen");
        }
        if(age > 85){  // 85+
            System.out.println("Old Senior Citizen");
        }



    }
}
/*
6. Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can
   define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement

 */