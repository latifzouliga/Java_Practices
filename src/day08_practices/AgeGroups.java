package day08_practices;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 21;

        String groups = (age >= 1 && age <= 150) ?
                (age > 85) ? "Old Senior Sitizen" : (age >= 75) ? "Senior Sitizen" : (age >= 65) ? "Young Senior Citizen"
                        : (age >= 55) ? "Very Young Senior Citizen" : (age >= 50) ? "Middle-Aged Adult"
                        : (age >= 40) ? "Young Middle-Aged Adult" : (age >= 21) ? "Adult" : (age >= 18) ? "Young Adult"
                        : (age >= 13) ? "Teenager" : (age >= 10) ? "Pre-teen" : (age >= 6) ? "Kid"
                        : (age >= 3) ? "Toddler" : "Infant"
                : "Invalid age";
        System.out.println(groups);


    }
}
/*
3. Create a class called AgeGroups
		write a program that can define the age groups of a person

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

        Note: MUST use ternary
 */