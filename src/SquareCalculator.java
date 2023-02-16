import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the width of your rectangle: ");

        double width = Double.parseDouble(reader.nextLine());
        System.out.println("Enter the height of your rectangle: ");
        double height = Double.parseDouble(reader.nextLine());
        //Declares height and assigns value
            System.out.println("The width of the square is: " + width + "cm " + "\n" +  "The height of the square is: " + height + "cm ");
            //Prints width and height
        double perimeter = 2*width + 2*height;
        //Declares and calculates perimeter
            System.out.println("The perimeter of this rectangle is: " + perimeter + "cm");
            //Prints the results of the perimeter

        double area = width * height;
        //Declares and calculates area
        System.out.println("The area of this rectangle is " + area);
        //Prints the result of the area
    }
}
