package variables.examples;

import java.util.Scanner;

public class CreatingSumMethod {
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);

        int integerA;
        int integerB;

        int total;

        System.out.print("Write some integer number: ");
        integerA  = sc.nextInt();

        System.out.print("\nWrite some other integer number: ");
        integerB = sc.nextInt();

        total = integerA + integerB;

        System.out.print("\n\nTotal is: "+total);

    }
}
