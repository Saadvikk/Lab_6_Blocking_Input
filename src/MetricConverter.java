import java.util.Scanner;
public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double meters = 0;

        do
        {
            System.out.print("Enter your measurement in meters: ");
            if (scanner.hasNextDouble())
            {
                meters = scanner.nextDouble();
            }
            else
            {
                System.out.print("Please enter an invalid input and try again! ");
                scanner.next();
                meters = 1;
            }
        } while (meters < 0);

        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.println(meters + " meters in miles is " + miles);
        System.out.println(meters + " meters in feet is " + feet);
        System.out.println(meters + " meters in inches is " + inches);

        scanner.close();
    }
}
