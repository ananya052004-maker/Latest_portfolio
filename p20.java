import java.io.*;
import java.util.*;
public class p20 
{
    public static void main(String[] args)
    {
        LinkedHashMap <String,Integer> a = new LinkedHashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String s = in.nextLine();
            int r = in.nextInt();
            in.nextLine();
            a.put(s,r);
        
        }
        String s1 = in.nextLine();
        int r1 = in.nextInt();
        a.put(s1,r1);
        if(a.containsValue(s1))
        {
            a.replace(s1,r1);
        }
        else{
            a.put(s1,r1);
        }

        System.out.println(a);
        in.close();
    }
    
}
