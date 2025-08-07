import java.util.*;
import java.io.*;
public class ty 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        LinkedHashMap <String,Double> a = new LinkedHashMap<>();
        boolean d=true;
        double c=0.0;
        double s=0.0;
        double r=0.0;
        while(d)
        {
            String s2 = in.nextLine();
            if(s2.equals("done"))
            {
                d=false;
            }
            else
            {
                String[] s1=s2.split(":");
                String name = s1[0];
                double i=Double.parseDouble(s1[1]);
                c++;
                s+=i;
                if(c%2==0)
                {
                    r=(s+1.0)/c;
                    a.put(name,r);
                }
                else
                {
                    r=s/c;
                    a.put(name,r);
                }

            }
        }
        System.out.format("%.2f\n",r);
        in.close();
    }
    
}
