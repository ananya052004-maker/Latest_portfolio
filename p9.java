import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try {
            
            File studentFile = new File("E:\\folder\\student.txt");
            FileWriter studentWriter = new FileWriter(studentFile);
            
            System.out.print("Enter the number of subjects: ");
            int n = in.nextInt();
            int[] marks = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                marks[i] = in.nextInt();
                total += marks[i];
                studentWriter.write(marks[i] + "\n"); 
            }
            studentWriter.close();
            double average = (double) total / n;
            File performanceFile = new File("E:\\folder\\performance.txt");
            FileWriter performanceWriter = new FileWriter(performanceFile);
            performanceWriter.write("Total Score: " + total + "\n");
            performanceWriter.write("Average Marks: " + String.format("%.2f", average) + "\n");
            performanceWriter.close();
            

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}
