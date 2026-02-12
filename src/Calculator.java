import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first, second;
        String op;
        System.out.println("Hello");
        System.out.print("Enter 1st number: ");
        first = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        second = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();
        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("Thank you");
    }
}