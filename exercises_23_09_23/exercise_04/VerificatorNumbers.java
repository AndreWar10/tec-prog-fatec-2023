package exercises_23_09_23.exercise_04;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//4) Crie um programa que receba um número inteiro n e leia n valores do teclado e compute quantos destes valores são negativos.

public class VerificatorNumbers {

    private static Scanner scan = new Scanner(System.in);

    private static int readInput(int position) {
        //if number is valid (int), return ... else show error!
        while (true) {
            try {
                System.out.print("Insert the " + position + "º number: ");
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("The number must be INTEGER !!! \n");
            }
        }
    }

    public static void main(String[] args) {

        final int INPUT_NUMBERS_LENGTH = 5;
        final int RETURN_NUMBER_NEGATIVE = -1;

        ArrayList<Integer> typedNumbers = new ArrayList<>();
        int lengthOfNegatives = 0;
        
        for (int i = 1; i <= INPUT_NUMBERS_LENGTH; i++) {
            typedNumbers.add(readInput(i));
            int typedNumber = typedNumbers.get(i-1);
            //verify if is more than 0
            if (Math.signum(typedNumber) == RETURN_NUMBER_NEGATIVE) {
                lengthOfNegatives += 1;
            }
        }

        //order in natural order
        typedNumbers.sort(Comparator.naturalOrder());

        //print response:
        System.out.println("-------------------------------------");
        System.out.println("Typed numbers: \n" + typedNumbers + "\n");
        System.out.println("Length of negative numbers: " + lengthOfNegatives);
        System.out.println("-------------------------------------");

    }
}