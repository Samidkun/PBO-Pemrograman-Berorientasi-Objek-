import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

       
        System.out.print("Enter an operator (+ or -): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

      
        double result = calculate(number1, operator, number2);
        System.out.println("Result: " + result);
    }

   
    public static double calculate(double number1, char operator, double number2) {
        if (operator == '+') {
            return number1 + number2;
        } else if (operator == '-') {
            return number1 - number2;
        } else {
            System.out.println("Invalid operator.");
            return 0;
        }
    }
}
