package Question1;
import java.util.Scanner;

public class NumberSerch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sequence of numbers
        System.out.print("Write the size of the array you want to crearte  : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int j = 0; j < size; j++) {
            numbers[j] = scanner.nextInt();
        }

        // Input number to be searched
        System.out.print("Enter the number you want it to be searched: ");
        int searchNumber = scanner.nextInt();

        // here the code for counting and searching
        int count = 0;
        for (int number : numbers) {
            if (number == searchNumber) {
                count++;
            }
        }

        // show the result
        if (count > 0) {
            System.out.println("The number " + searchNumber + " is present in the array " + count + " times.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }

        scanner.close();
    }
}



