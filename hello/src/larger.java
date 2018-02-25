import java.util.Scanner;

public class larger {
    public static void main (String[] args)
    {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        //  prompt for the user's name
        System.out.print("Enter First Number: ");

        // get their input as a String
        int num1 = scanner.nextInt();

        // prompt for their age
        System.out.print("Enter Second Number: ");

        // get the age as an int
        int num2 = scanner.nextInt();

        int result = num1 >= num2 ? num1 : num2;

        System.out.println(String.format("%d is larger.", result));

    }
}
