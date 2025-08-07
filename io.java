import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class io {
    public static void main(String[] args) throws IOException
    {
        File student= new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\student.txt");
        File performance = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\performance.txt");
        FileWriter f = new FileWriter(student);
        PrintWriter p = new PrintWriter(f);
        Scanner in = new Scanner(System.in);
        FileReader fr = new FileReader(student);
        BufferedReader br = new BufferedReader(fr);
        PrintWriter x = new PrintWriter(performance); 
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            p.println(a[i]);

        }
        p.close();
        String s = br.readLine();
        double total=0;
        while(s!=null)
        {
            double d = Double.parseDouble(s);
            total+=d;
            s=br.readLine();

        }
        x.println(total);
        x.println(total/n);
        x.close();
        in.close();
        br.close();
       
    }
    
}
