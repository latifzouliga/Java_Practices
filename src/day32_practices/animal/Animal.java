package day32_practices.animal;


import java.util.ArrayList;
import java.util.Arrays;

public abstract class Animal {

    private String name, breed;
    private final char gender;
    private final int age;
    private String size, color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);

        // gender conditions
        boolean isValidGender = gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f';
        if (!isValidGender){
            System.err.println("Invalid gender : "+gender+"\nGender "+getClass().getSimpleName()+" can only be M/F");
            System.exit(1);
        }
        this.gender = gender;

        // age conditions
        if (age <= 0) {
            System.err.println("Invalid age: " + age + "\nAge can not be set to zero or negative");
            System.exit(1);
        }
        this.age = age;

        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // setting colors for lion
        ArrayList<String> lionColors = new ArrayList<>(Arrays.asList("Yellow","Orange","Gray","While"));
        if (breed.contains("lion") || breed.contains("Lion")){
            if (!lionColors.contains(color)){
                System.err.println("Invalid lion color: "+color);
                System.exit(1);
            }
        }
        this.color = color;
    }

    public void drink() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is drinking water");
    }

    public abstract void eat();

    public abstract void sleep();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
