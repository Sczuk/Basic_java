package variables.examples;

import java.util.Scanner;

public class CreatingSubtractionMethod {
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);

        double doubleA;
        double doubleB;

        double total;

        System.out.print("Write some number: ");
        doubleA  = sc.nextInt();

        System.out.print("\nWrite some other number: ");
        doubleB = sc.nextInt();

        total = doubleA - doubleB;

        System.out.print("\n\nTotal is: "+total);

    }

}
