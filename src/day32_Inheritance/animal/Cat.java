package day32_Inheritance.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " "+ getName()+" is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " "+ getName()+" is sleeping 12 hours a day");
    }

    public void scratch(){
        System.out.println(getClass().getSimpleName() + " "+ getName()+" is scratching");
    }

}
