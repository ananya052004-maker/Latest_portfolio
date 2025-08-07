import java.util.*;
import java.io.*;
public class 17
{
    public static void main(String[]args) throws IOException
    {
        File f1 = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\f1.txt");
        FileWriter f = new FileWriter(f1);
        PrintWriter p = new PrintWriter(f);
        FileReader r = new FileReader(f1);
        BufferedReader b = new BufferedReader(r);
        

        File f2 = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\f2.txt");\
        FileWriter s = new FileWriter(f2);
        PrintWriter p1 = new PrintWriter(s);
        FileReader r1 = new FileReader(f2);
        BufferedReader b1 = new BufferedReader(r1);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            p.println(a[i]);
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        p.close();


        

        int n1 = in.nextInt();
        int[] a1 = new int[n1];
        int max1=a1[0];
        for(int i=0;i<n1;i++)
        {
            p1.println(a1[i]);
            if(a1[i]>max1)
            {
                max1=a1[i];
            }
        }
        p.close();

        String j = b.readLine();
        String j1 = b1.readLine();
        if(max>max1)
        {
            System.out.println(max);

        }
        else{
            System.out.println(max1);
        }
        b.close();
        b1.close();
        in.close();

    }
    
}

