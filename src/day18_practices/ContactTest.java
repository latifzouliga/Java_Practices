package day18_practices;

public class ContactTest {

    public static void main(String[] args) {

        Contact person1 = new Contact();
        person1.setInfo("Abdellatif Zouliga", 1234342344,"zuuliga123@yahoo.cm");

        person1.call();
        person1.sendMessage();
        person1.sendEmail();

    }
}
