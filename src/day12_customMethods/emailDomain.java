package day12_customMethods;

public class emailDomain {

    public static void main(String[] args) {

        emailDomain("zuuliga@gmail.com");

    }

    public static void emailDomain(String domainName){

        //Cydeo@gmail.com


        domainName = domainName.substring(domainName.indexOf("@")+1,domainName.indexOf("."));

        System.out.println(domainName);





    }

}
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */