package condition.examples;

import java.util.Scanner;

public class WeightValidator {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        double weight;
        double heigth;
        double imc;

        System.out.println("======IMC Calculator======\n");

        System.out.println("\nwhat is your weight (kilos)");
        System.out.print("R: ");
        weight = sc.nextDouble();

        System.out.println("\nwhat is your heigth (meters)");
        System.out.print("R: ");
        heigth = sc.nextDouble();

        imc = (heigth * heigth)/weight;

        if(imc < 18.5){
            System.out.println("=====Underweight=====");
        }

        if(imc >= 18.5 || imc <= 24.9){
            System.out.println("=====Ideal weight======");
        }

        if(imc >= 25 || imc <= 29.9){
            System.out.println("=====Overweight=====");
        }

        if(imc >= 30 || imc <= 34.9){
            System.out.println("=====Grade I obesity=====");
        }

        if(imc >= 35 || imc <= 39.9){
            System.out.println("=====Grade II obesity=====");
        }

        if(imc > 40){
            System.out.println("=====Grade III obesity=====");
        }
    }
}
