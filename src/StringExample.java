import java.util.Scanner;

public class StringExample {
    public static void main(String[] args)
    {
        System.out.print("Enter your full name: ");
        Scanner keyboard = new Scanner(System.in);
        String fullName = keyboard.nextLine();

        System.out.printf("Before trim, there are %d characters in the String%n",fullName.length());
        fullName = fullName.trim();
        System.out.printf("After trim, there are %d characters in the String%n",fullName.length());

        System.out.printf("%nThere are %d letters in your name%n",fullName.length()-1);
        System.out.printf("Your first name is %s%n",fullName.substring(0, fullName.lastIndexOf(' ')));
        System.out.printf("Your last name is %s%n",fullName.substring(fullName.lastIndexOf(' ')+1));
        System.out.printf("Your initials are %s%s%n",fullName.charAt(0), fullName.substring(fullName.lastIndexOf(' ')+1).charAt(0));
        System.out.printf("Your name in upper case: %s%n", fullName.toUpperCase());
        System.out.printf("Your name in lower case: %s%n", fullName.toLowerCase());
        System.out.printf("If you changed all 'a' for 'e' your name would be %s%n", fullName.replace('a','e'));


    }
}
