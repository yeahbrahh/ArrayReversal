import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numberArray = new int[100];
        int numbers = 0;

        System.out.println("Enter values (-1 to stop) ");

        while (true) {
            System.out.print(": ");

            int num = sc.nextInt();

            if (num == -1) {
                break;
            }
            numberArray[numbers] = num;
            numbers++;
        }
        // Prints numbers in reverse
        System.out.println("Your values, reversed: ");
        for (int i = numbers - 1; i >= 0; i--) {
            System.out.println(numberArray[i] + " ");
        }
        sc.close(); // close Scanner
    }
}

