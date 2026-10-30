package compute;

import java.util.Scanner;

public class Compute {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;

        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            System.out.print("Enter the power: ");
            int power = input.nextInt();

            int result = (int) Math.pow(number, power);

            System.out.println(number + " power of " + power + " = " + result);

            System.out.print("Do you want to calculate another number? (yes/no): ");
            answer = input.next();

            System.out.println();

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("Program ended.");

        input.close();
    }
}
