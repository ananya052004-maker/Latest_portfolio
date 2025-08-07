import java.util.*;

public class nw {

    // Non-generic Array class that works directly with int[]
    public static class Array {
        private int[] a;
        private int s;

        // Constructor to initialize the array and its size
        public Array(int[] a, int s) {
            this.a = a;
            this.s = s;
        }

        // Method to calculate the first occurrence and count occurrences of 'n'
        public void calculate(int[] a, int s, int n) {
            int x = -1;  // Initialize x to -1, meaning "not found" by default

            // Find the first occurrence of 'n' in the array
            for (int i = 0; i < s; i++) {
                if (a[i] == n) {  // Use == for primitive comparison
                    x = i;  // Assign index of first occurrence
                    break;  // Exit the loop after finding the first occurrence
                }
            }

            System.out.println(x);  // Print the index of the first occurrence

            // Count occurrences of 'n'
            int c = 0;
            for (int i = 0; i < s; i++) {
                if (a[i] == n) {  // Use == for primitive comparison
                    c++;  // Increment counter when 'n' is found
                }
            }
            System.out.println(c);  // Print the count of occurrences
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();  // Get the size of the array
        int num = in.nextInt();   // Get the number to search for

        // Create an int[] array for primitive type
        int[] arr = new int[size];

        // Read the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();  // Read int values
        }

        // Instantiate the Array class and call the calculate method
        Array at = new Array(arr, size);
        at.calculate(arr, size, num);  // Pass int array and primitive type

        in.close();
    }
}
