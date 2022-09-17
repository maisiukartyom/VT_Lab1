package tangent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter begin value: ");
            int begin = scan.nextInt();
            System.out.print("Enter end value: ");
            int end = scan.nextInt();
            System.out.print("Enter step value: ");
            int step = scan.nextInt();
            Calculations calc = new Calculations();

            calc.isCorrectInput(begin, end, step);

            int[] values = calc.getStepsOnTheLine(begin, end, step);
            double[] tanValues = calc.getTanValues(values);

            calc.printTable(values, tanValues);
        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Not int value.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
