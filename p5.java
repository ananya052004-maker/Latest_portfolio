import java.util.*;
public class p5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        try
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int r = a/b;
            System.out.println(r);
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid input"+e.getMessage());
        }
        finally{
            in.close();
        }
    }
}
