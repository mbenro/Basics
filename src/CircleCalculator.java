import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the radius of your circle: ");
        double circleRadius = Double.parseDouble(reader.nextLine());
        //Declares radius
        double circleDiameter = circleRadius*2;
        //Declares and calculates diameter
        double circleCircumference = circleDiameter * 3.14;
        //Declares and calculates circumference
        double circleArea = circleRadius * circleRadius * 3.14;
        //Declares and calculates radius

        System.out.println("The radius of the circle is: " + circleRadius + "cm");
        //Prints radius
        System.out.println("The diameter or the circle is: " + circleDiameter + "cm");
        //Prints diameter
        System.out.println("The circumference of the circle is: " + circleCircumference + "cm");
        //Prints circumference
        System.out.println("The area of the circle is: " + circleArea + "cm2");
        //Prints area
    }
}
