package day27_statics;

public class Dog {
    public String breed, size;
    public char gender;
    public int age;
    public String color;
    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public boolean isFriendly;

    public Dog(String breed, String size, char gender, int age, String color, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings =0;
    }

    public void eat(){
        System.out.println(breed+ " is eating");
    }

    public void drink(){
        System.out.println(breed+ " is drinking");
    }

    public void sleep(){
        System.out.println(breed+ " is sleeping");
    }

    public void play(){
        System.out.println(breed+ " is playing");
    }

    public void bark(){
        System.out.println(breed+ " is barking");
    }


    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
/*
3.  Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */