package randomPackage.java10_to_java21;


import java.util.Objects;

// this Alien record class has all what Alien class has
// record class is immutable which means that we can not change the data one it is set
// does not have setter
// record can be used for data transfer (data carrying object) (DTO)
record Human(int age, String name){
}


// in alien class we have 2 fields, one constructor, getters, equals and hashcode and toString method
public class Alien {

    private final int age;
    private final String name;

    public Alien(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Alien alien = (Alien) object;
        return age == alien.age && Objects.equals(name, alien.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        // Alien class object
        Alien alien1 = new Alien(37,"Zouliga");
        Alien alien2 = new Alien(37,"Zouliga");

        // if we compare to objects that have the same value, we'll get false
        // that's where implementing equals and hashcode methods come handy
        System.out.println(alien1.equals(alien2));         // true
        System.out.println(alien1);                        //  Alien{age=37, name='Zouliga'}



        // Human record class
        Human person1 = new Human(33,"Latif");
        Human person2 = new Human(33,"Latif");

        System.out.println(person1.equals(person2));       // true
        System.out.println(person1);                       // Human[age=33, name=Latif]



    }
}


