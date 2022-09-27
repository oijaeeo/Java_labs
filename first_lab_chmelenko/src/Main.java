import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("PLease, enter a string: ");
        String str = scan.nextLine();
        StringCalculator stringCalculator = new StringCalculator();
        int sumResult = -1;
        try {
            sumResult = stringCalculator.add(str);
        } catch (CalculatorExceptions e) {
            System.err.print("ERROR: "+ e.getMessage());
        }
        if (sumResult != -1) {
            System.out.print("Sum : " + sumResult);
        }
    }
}