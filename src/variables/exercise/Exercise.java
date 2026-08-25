package variables.exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);

        double numberA;

        double numberB;

        double totalSum;
        double totalSubtraction;
        double totalDivision;
        double totalMultiply;

        System.out.print("Write some number: ");
        numberA = sc.nextDouble();

        System.out.print("\nWrite some other number: ");
        numberB = sc.nextDouble();

        totalSum = numberA + numberB;
        totalSubtraction = numberA - numberB;
        totalDivision = numberA / numberB;
        totalMultiply = numberA * numberB;

        System.out.printf("total sum: "+totalSum);
        System.out.printf("total subtraction: "+totalSubtraction);
        System.out.printf("total division: "+totalDivision);
        System.out.printf("total multiplication: "+totalMultiply);
    }
}
