package day29_Encapsulation.phneTask;

public class Iphone extends Phone{


    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+" facetime "+ phoneNumber);
    }
    public void facetime(String email){
        System.out.println(getBrand()+" facetime "+ email);
    }
}
