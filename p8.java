import java.util.*;
class NegativeNumberException extends Exception
{
    public NegativeNumberException()
    {
        super("Negative number entered");
    }
}
public class p8 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        try
        {
            int num=in.nextInt();
            if(num>0)
            {
                System.out.println(num*2);
            }
            else
            {
                throw new NegativeNumberException();
            }

        }
        catch(NegativeNumberException e)
        {
            System.out.println("NegativeNumberException :"+e.getMessage());
        }
        finally
        {
            in.close();

        }
    }
}
