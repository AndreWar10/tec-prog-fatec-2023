package exercises_23_09_23.exercise_04;

import java.util.ArrayList;
import java.util.Scanner;

public class VerificatorNumbers {

    private static Scanner scan = new Scanner(System.in);

    private static int readInt(int position) {
        while (true) {
            try {
                System.out.print("Insira o " + position + " número: ");
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Tem que ser número! \n");
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int lengthNegatives = 0;

        for (int i = 0; i <= 4; i++) {
            numbers.add(readInt(i + 1));
            int number = numbers.get(i);
            //verify if is more than 0
            if (Math.signum(number) == -1) {
                lengthNegatives += 1;
            }

        }
        System.out.println("-------------------------------------");
        System.out.println("Números digitados: \n" + numbers + "\n");
        System.out.println("Números negativos: " + lengthNegatives);
        System.out.println("-------------------------------------");

    }
}