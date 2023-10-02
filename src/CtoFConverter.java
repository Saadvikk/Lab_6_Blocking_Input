import java.sql.SQLOutput;
import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double c = 0;
        double f = 0;
        double nextDouble = 0;
        boolean done = false;

        do
        {
            System.out.print("Please enter the degrees celsius that you want to convert into fahrenheit: ");

            if (scanner.hasNextDouble())
            {
                c = scanner.nextDouble();
                f = (c * 1.8 + 32);
                System.out.println("Your input of " + c + " degrees celsius is equal to " + f + " degrees fahrenheit. ");
            }
            else
            {
                System.out.print("Please enter an invalid input and try again! ");
                scanner.next();
                done = true;
            }
        } while (done);

        System.out.println("The program is now exiting.");
        scanner.close();

    }
}