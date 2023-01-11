package day06_practices;

public class CharacterIdentity {
    public static void main(String[] args) {
        int num = 1;
        char ch  = '@';

        if (ch == num);{
            System.out.println(num + " is a digit");
        }
        if (ch == ch){
            System.out.println(ch + " is a character");
        }




    }
}
/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit
  or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the characters on ASCII table
 */