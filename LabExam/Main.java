package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Read array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Prompt user for the number to search
        System.out.print("Enter the number to search for: ");
        int searchNumber = scanner.nextInt();

        // Search for the number and count occurrences
        int count = 0;
        for (int num : array) {
            if (num == searchNumber) {
                count++;
            }
        }

        // Output results
        if (count > 0) {
            System.out.println(searchNumber + " appears " + count + " times in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }

        scanner.close();
    }
}


