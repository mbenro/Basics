import java.util.Scanner;
public class LogicalAnd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Calculating if your number is between 5 AND 10...");



                if(number>4 && number<11)
                {
                    System.out.println("Yes :)");
                }
                else
                {
                    System.out.println("Nope:(");
                }
    }
}
