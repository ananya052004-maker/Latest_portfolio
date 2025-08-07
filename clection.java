import java.util.*;
import java.io.*;
class solution
{
    public static boolean isArmstrong(int num)
    {
        int num1=num;
        
        int r = num%10;
        int q = (num/10)%10;
        int o = num/100;
        int result = r*r*r+q*q*q+o*o*o;
        if(result==num1)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
class clection
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\x.txt");
        FileWriter w = new FileWriter(f);
        PrintWriter p = new PrintWriter(w);
        FileReader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);

        File f2 = new File("C:\\Users\\anany\\OneDrive\\Desktop\\complete web dev\\x1.txt");
        FileWriter w1 = new FileWriter(f2);
        PrintWriter p1 = new PrintWriter(w1);
        FileReader r1 = new FileReader(f2);
        BufferedReader br1 = new BufferedReader(r1);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            p.println(in.nextInt());
        }
        p.close();
        
        
        String s1 = br.readLine();
        while(s1!=null)
        {
            int x = Integer.parseInt(s1);
            if(solution.isArmstrong(x))
            {
                p1.println(x);
            }
            

        }
        br.close();
        p1.close();
        String str = br1.readLine();
        while(str!=null)
        {
            System.out.println(str);
        }
        br1.close();
        in.close();
    }
}
