import java.util.Scanner;
public class LogicalOr {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.nextLine());

        if(age<18 || age>60)
        {
            System.out.print("Sorry, this is not available for you.");
        }else {
            System.out.println("You are in!");
        }



    }
}
