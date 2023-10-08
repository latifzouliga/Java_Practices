package day26_constructor;

public class Person {

    public String name;
    public int age;
    public char gender;
    public static boolean isHuman = true, hasNose = true, hasWings = false;
    public static int numberOfHeads = 1, numberOfEyes = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name + " is eating "+ food);
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking "+ drink);
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {

        Person p1 = new Person("Abdellatif",36,'M');
        System.out.println(p1);

        System.out.println("Is human: "+isHuman);
        System.out.println("Has nose: "+hasNose);
        System.out.println("Has wings: "+hasWings);
        System.out.println("Number of heads: "+Person.numberOfHeads);
        System.out.println("Number of eyes: "+numberOfEyes);
        p1.eat("Burger");
        p1.drink("Juice");
        p1.sleep();


    }
}
/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */