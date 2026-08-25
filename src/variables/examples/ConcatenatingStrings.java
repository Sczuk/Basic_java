package variables.examples;

import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);

        String firstName;
        String lastName;


        System.out.print("Write your fist name: ");
        firstName = sc.nextLine();

        System.out.print("\nWrite your last name: ");
        lastName = sc.nextLine();

        System.out.println("\n\nthis name: "+firstName+" "+lastName+", its so beautiful");

    }
}
