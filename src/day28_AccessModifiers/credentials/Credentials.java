package day28_AccessModifiers.credentials;

public class Credentials {

    private String userName, password;


    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {

        // checking whether userName is empty or blank
        if (userName.isBlank() || userName.isEmpty()){
            System.err.println("User name should not be Empty or blank");
            System.exit(1);
        }

        // checking the length of  userName
        if(userName.length() < 6 ){
            System.err.println("Your user name is too short");
            System.exit(1);
        }

        // checking whether userName includes white spaces
        if(userName.trim().length() != userName.length()){
            System.err.println("user name should not contain space in the beginning or in the end");
            System.exit(1);
        }

        //checking whether userName indudes spaces inside
        if(userName.replace(" ","").length() != userName.length()){
            System.err.println("user name should not contain space between letters");
            System.exit(1);
        }

        /*
        String ch = userName.substring(0,1);
        if ( !userName.substring(0,1).toLowerCase().equals(ch)){
            System.err.println("user name should not start with upper case letter");
            System.exit(1);
        }

 */

        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        // check whether password has spaces
       int length  = password.replace(" ","").toCharArray().length;
       if (password.length() != length){
           System.err.println("Password should not include spaces");
           System.exit(1);
        }

       // check whether the password is strong
        if (!isStrongPassWord(password)) {
            System.err.println("Your password is week ");
            System.exit(1);
        }
        this.password = password;
    }

    public boolean isStrongPassWord(String word) {

        int isLetter = 0;
        int isDigit = 0;
        int isSpecialChar = 0;


        // counting digits, letters and special chars in a password
        for (char each : word.toCharArray()) {
            if (Character.isDigit(each)) {
                isDigit++;
            } else if (Character.isLetter(each)) {
                isLetter++;
            } else {
                isSpecialChar++;

            }
        }

        // checking whether a password includes letters, digits and special chars
        if (isLetter != 0 && isDigit != 0 && isSpecialChar != 0) {
            if (word.length() > 7) { // checking whether password length is 8 chars or greater
                return true;
            }
        }
        return false;
    }


    public String toString() {
        return "Credentials{" +
                "userName='" + getUserName() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }
}
/*
6. create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()
 */