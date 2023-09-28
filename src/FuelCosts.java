import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double gallonsTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;

        do
        {
            System.out.print("Enter the number of gallons that is in the tank: ");
            gallonsTank = scanner.nextDouble();
        } while (gallonsTank <= 0);

        do
        {
            System.out.print("Enter your fuel efficiency: ");
            fuelEfficiency = scanner.nextDouble();
        } while (fuelEfficiency <= 0);

        do
        {
            System.out.print("Enter your price per gallon: ");
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);

        double costPer100 = (100 / fuelEfficiency) * pricePerGallon;
        System.out.println("Your cost per 100 miles is " + costPer100);

        double distance = gallonsTank * fuelEfficiency;
        System.out.println("Your car can go " + distance + " miles.");
    }
}
