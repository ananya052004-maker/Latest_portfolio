import java.util.*;
import java.io.*;

public class result 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        LinkedHashMap <String,Double> a = new LinkedHashMap<>();
        boolean d = true;
        int c=0;
        String s=null;
        String s2=null;
        double max=0.0;
        
        while(d)
        {
            String s1 = in.nextLine();
            c++;
            if(s1.equals("done"))
            {
                d=false;
            }
            else
            {
                Double n = in.nextDouble();
                in.nextLine();
                
                for(int i=0;i<c;i++)
                {
                    if(n>max)
                    {
                        max=n;
                        s=s1;
                    }
                    else if(n<max)
                    {
                        s2=s1;
                    }
                }
                a.put(s1,n);
            }
        }
        System.out.println(s);
        System.out.println(s2);
        in.close();
    }
    
}
