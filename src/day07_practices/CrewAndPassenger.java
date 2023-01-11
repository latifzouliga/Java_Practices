package day07_practices;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int numOfPeople = 75;
        String result = "";
        if (numOfPeople == 50 || numOfPeople == 75 || numOfPeople ==100){
            if (numOfPeople == 50){
                result = "Total: 50  ====> 20 crew, 30 passengers";
            } else if (numOfPeople == 75) {
                result = "Total: 75  ====> 25 crew, 50 passengers";
            }else {
                result = "Total: 100 ====> 30 crew, 70 passengers";
            }

        }else {
            result = "Invalid number";
        }
        System.out.println(result);




    }
}
/*
3. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need
   to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */