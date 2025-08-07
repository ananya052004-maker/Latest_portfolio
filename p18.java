import java.util.*;
import java.io.*;
public class p18
{
    public static void main(String[]args) throws IOException
    {
        File f1 = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\f1.txt");
        FileWriter f = new FileWriter(f1);
        PrintWriter p = new PrintWriter(f);
        FileReader r = new FileReader(f1);
        BufferedReader b = new BufferedReader(r);
        

        File f2 = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\f2.txt");
        FileWriter s = new FileWriter(f2);
        PrintWriter p1 = new PrintWriter(s);
        FileReader r1 = new FileReader(f2);
        BufferedReader b1 = new BufferedReader(r1);

        File f2 = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\f2.txt");
        FileWriter s = new FileWriter(f2);
        PrintWriter p1 = new PrintWriter(s);
        FileReader r1 = new FileReader(f2);
        BufferedReader b1 = new BufferedReader(r1);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            p.println(in.nextInt());
        }
        int m = in.nextInt();
        for(int i=0;i<m;i++)
        {
            p1.println(in.nextInt());
        }
        p.close();
        p1.close();
    

        String j = b.readLine();
        String j1 = b1.readLine();
        String[] s3 = new String[m];
        for(int i=0;i<j1.length();i++)
        {
            s3[i]=j1;
        }
        while(j!=null)
        {
            for(int i=0;i<m;i++)
            {
                if(j.equals(j1))
                {
                    System.out.println(j);
                    in.nextLine();
                }
                b1.readLine();
            }
            b.readLine();
        }
        
        b.close();
        b1.close();
        in.close();

    }
    
}

