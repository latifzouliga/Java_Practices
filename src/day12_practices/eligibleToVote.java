package day12_practices;

public class eligibleToVote {

    public static void main(String[] args) {

        int age = 10;
        boolean isAmerican = true;

        eligibleToVote(age,isAmerican);




    }

    public static void eligibleToVote(int age,boolean isAmerican){

        if (age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are NOT eligible to vote");
        }


    }



}
/*
6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */