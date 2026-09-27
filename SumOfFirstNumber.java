import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int number = 1;

        while (number <= n) {
            System.out.println(number);
            number++;
        }
    }
}
