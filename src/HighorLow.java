import java.util.Scanner;
import java.util.Random;
public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean done = false;

        int guess = 0;

        int randomNumber = random.nextInt(10) + 1;

        do
        {
            System.out.print("Guess a random number between 1 & 10: ");

            if (scanner.hasNextInt())
            {
                guess = scanner.nextInt();

            }
            else
            {
                guess = 0;
                System.out.print("Please enter an invalid input and try again! ");
                scanner.next();

            }

            // Guessing System

            if (guess == randomNumber)
            {
                System.out.println("Congratulations, you guessed the right number!");
            }
            else if (guess < randomNumber)
            {
                System.out.println("Your guess is too low!");
            }
            else
            {
                System.out.println("Your guess is too high!");
            }
        } while (!false);

    }
}
