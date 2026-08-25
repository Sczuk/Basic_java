package variables.examples;

import java.util.Scanner;

public class EnteringValues {
    public static void main(String...args){

        Scanner scanner = new Scanner(System.in);

        String name;

        int age;

        char sex;

        double heightMeters;

        System.out.println("==================================");

        System.out.println("what is your name?");
        name = scanner.nextLine();

        System.out.println("what is your age?");
        age = scanner.nextInt();

        System.out.println("what is your gender? (M or F)");
        sex = scanner.nextLine().charAt(0);

        System.out.println("What is you height (meters: 1.80)");
        heightMeters = scanner.nextDouble();

        System.out.println("==================================\n\n");

        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your gender it is: "+sex);
        System.out.println("Your height is: "+heightMeters);

        System.out.println("==================================");



    }
}
