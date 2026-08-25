package condition.examples;

import java.util.Random;
import java.util.Scanner;

public class MathGameWithElse {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=========Game=========");
        System.out.println("Write the correct number to win\n");

        int number1;
        int number2;
        int answer;

        number1 = random.nextInt();
        number2 = random.nextInt();

        System.out.println("What is "+number1+" + "+number2+" ?\n");
        System.out.print("R: ");
        answer = sc.nextInt();

        if(answer==number1+number2){
            System.out.println("You so smart, congratulations");
        }else{
            System.out.println("=====You are wrong=====");
            System.out.println("Try again");
        }

    }
}
