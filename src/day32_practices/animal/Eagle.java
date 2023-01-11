package day32_practices.animal;

public class Eagle extends Animal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " "+ getName()+ " is eating snakes and rabbits");
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " "+ getName()+ " sleeps from sleeps standing on his two legs");
    }

    public void fly(){
        System.out.println(getClass().getSimpleName() + " "+ getName()+ " is flying");
    }


}
