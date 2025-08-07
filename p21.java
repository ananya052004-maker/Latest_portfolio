import java.io.*;
import java.util.*;
public class p21
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
            System.out.println(s);
            System.out.println(r);
        }
        String s1 = in.nextLine();

        if(a.containsKey(s1))
        {
            System.out.println(a.get(s1));
        }
        in.close();
    }
    
}

