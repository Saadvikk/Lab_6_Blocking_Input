import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;

        do
        {
            System.out.print("Enter your width for the rectangle: ");
            if (scanner.hasNextDouble())
            {
                width = scanner.nextDouble();
            }
            else
            {
                System.out.print("Please enter an invalid input and try again! ");
                scanner.next();
                width = 1;
            }
        } while (width <= 0);

        do
        {
            System.out.print("Enter your height for the rectangle: ");
            if (scanner.hasNextDouble())
            {
                height = scanner.nextDouble();
            }
            else
            {
                System.out.print("Please enter an invalid input and try again! ");
                scanner.next();
                height = 1;
            }
        } while (height <= 0);

        double area = width * height;
        double perimeter = (width * 2) + (height * 2);
        double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The hypotenuse of the rectangle is " + hypotenuse);
    }
}
