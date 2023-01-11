package day32_practices.animal;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " "+ getName()+" is eating dog food");

    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " "+ getName()+" is sleeping every 2 hours");
    }

    public void bark(){
        System.out.println(getClass().getSimpleName() + " "+ getName()+ " is barking");
    }
}
