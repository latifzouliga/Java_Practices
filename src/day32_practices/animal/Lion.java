package day32_practices.animal;

public class Lion extends Animal {

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " "+ getName()+" is eating deer");
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " "+ getName()+" is sleeping all day long");
    }

    public void roar(){
        System.out.println(getClass().getSimpleName() + " "+ getName()+ " is roaring");
    }

}
