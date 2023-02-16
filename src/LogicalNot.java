import java.util.Scanner;
public class LogicalNot {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a colour: ");
        String colour = reader.nextLine();

        if(!(colour.equals("red")))
        {
            System.out.println("That colour is available.");
        }

        else
        {
            System.out.println("Sorry, we don't have that colour.");
        }
    }
}
