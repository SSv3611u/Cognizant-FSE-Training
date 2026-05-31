import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess the number between 1 and 100");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high");
            } else if (guess < number) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct guess");
            }
        }

        sc.close();
    }
}
