package day32_Inheritance.animal;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Lucy","Bangle",'F',2,"Small","Cray");

        Dog dog = new Dog("Max","Husky",'M',5,"Large","Black");

        Lion lion = new Lion("Simba","African lion",'m',7,"Large","Orange");

        Eagle eagle = new Eagle("Bella", "American Eagle",'F',5,"Medium","Black and White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);
        System.out.println("-------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("--------------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();

        System.out.println("--------------------------------------------");

        cat.scratch();
        dog.bark();
        lion.roar();
        eagle.fly();

        System.out.println("--------------------------------------------");

        cat.drink();
        dog.drink();
        lion.drink();
        eagle.drink();




    }
}
