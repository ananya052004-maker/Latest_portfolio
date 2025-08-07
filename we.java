import java.util.*;

public class we {

    public static class Array<T> {
        private T[] a;
        private int s;

        public Array(T[] a, int s) {
            this.a = a;
            this.s = s;
        }

        public void calculate(T[] a, int s, T n) {
            int x = -1;
            int c = 0;
            boolean found = false;
            
            // Iterate over the array
            for (int i = 0; i < s; i++) {
                if (a[i].equals(n)) {
                    if (!found) {
                        x = i;  // Store the index of the first occurrence
                        found = true;
                    }
                    c++;  // Count all occurrences
                }
            }
            
            // Print results based on whether the number was found or not
            if (!found) {
                System.out.println("not found");
            } else {
                System.out.println(x);  // First occurrence index
                System.out.println(c);  // Count of occurrences
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();  // Size of the array
        int num = in.nextInt();   // Number to search for
        Integer[] arr = new Integer[size];

        // Read the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        // Instantiate the Array class and call the calculate method
        Array<Integer> at = new Array<>(arr, size);
        at.calculate(arr, size, num);

        in.close();
    }
}

