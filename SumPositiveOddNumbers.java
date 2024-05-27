import java.util.Scanner;

public class SumPositiveOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sum positive odd numbers
        int sum = 0;
        for (int num : arr) {
            if (num > 0 && num % 2 != 0) {
                sum += num;
            }
        }

        // Output the result
        System.out.println("Sum of positive odd numbers: " + sum);

        scanner.close();
    }
}
