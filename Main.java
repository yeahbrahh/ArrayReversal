import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numberArray = new int[100]; // create array with a maximum of 100 elements
        int numbers = 0; // initialize numbers variable to 0

        System.out.println("Enter values (-1 to stop) ");

        while (true) {
            System.out.print(": ");

            int num = sc.nextInt();

            //   break loop when user enters -1
            if (num == -1) {
                break;
            }
            //  num is values entered
            // numbers is position of num values in array
            // numberArray is the array itself
            numberArray[numbers] = num;
            numbers++;  // increments numbers to next position in array
        }
        // reassigns i variable to numbers - 1 to begin at end of index of array
        // decrements i variable to move to previous position in array
        System.out.println("Your values, reversed: ");
        for (int i = numbers - 1; i >= 0; i--) {
            System.out.println(numberArray[i] + " ");
        }
        sc.close(); // close Scanner
    }
}

