public class IfStatement {
    public static void main(String[] args) {
        int x = 45;
        int number = 45;

        if (number > 0)
        {
            System.out.println("The number is positive!");
            if (number >x)
            {
                System.out.println("And is larger than x: " + x);
            }
        }
    }

}
