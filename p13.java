import java.util.*;

public class p13 {

    public static class Array<T> {  // Generic Array class
        private T[] a;
        private int s;

        // Constructor to initialize the array and its size
        public Array(T[] a, int s) {
            this.a = a;
            this.s = s;
        }

        // Method to calculate the first occurrence and count occurrences of 'n'
        public void calculate(T[] a, int s, T n) {
            int x = -1; 

            
            for (int i = 0; i < s; i++) {
                if (a[i].equals(n)) {  // Use .equals for object comparison
                    x = i;  // Assign index of first occurrence
                    break;  // Exit the loop after finding the first occurrence
                }
            }

            System.out.println(x);  // Print the index of the first occurrence

            // Count occurrences of 'n'
            int c = 0;
            for (int i = 0; i < s; i++) {
                if (a[i].equals(n)) {  // Use .equals for object comparison
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

        // Create an Integer array (not int[]) for working with generics
        Integer[] arr = new Integer[size];  // Use Integer[] instead of int[]

        // Read the array elements as Integer
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();  // Read Integer values
        }

        // Instantiate the Array class with Integer and call the calculate method
        Array<Integer> at = new Array<>(arr, size);
        at.calculate(arr, size, num);  // Pass Integer as the type

        in.close();
    }
}
