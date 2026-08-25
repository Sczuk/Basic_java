package loopFor.examples;

import java.util.Scanner;

public class RepeatMessage {
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);

        String message;
        int times;

        System.out.print("Write a message: ");
        message = sc.nextLine();

        System.out.print("\nHow many times do you want to repeat it? ");
        times = sc.nextInt();

        System.out.println("\n\n=====Result=====\n");

        for(int i = 0; i < times; i++){
            System.out.println(message);
        }

    }
}