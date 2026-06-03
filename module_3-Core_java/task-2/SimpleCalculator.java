import java.util.Scanner;

class SimpleCalculator {
    private static double calculate(double first, double second, char operator) {
        switch (operator) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                if (second == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return first / second;
            default:
                throw new IllegalArgumentException("Unsupported operator.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        try {
            double result = calculate(first, second, operator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
