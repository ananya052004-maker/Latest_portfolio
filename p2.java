
import java.util.*;

public class p2 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        try
        {
            double a = in.nextDouble();
            double b = in.nextDouble();
            in.nextLine();
            char op= in.nextLine().charAt(0);
            double result=0.0;
            boolean valid = true;
            switch(op)
            {
                case '+':
                result=a+b;
                
                break;
                case '-':
                result=a-b;
                
                break;
                case '*':
                result=a*b;
                
                break;
                case '/':
                if(b==0)
                {
                    System.out.println("Cannot divide by zero");
                    valid=false;
                }
                else
                {
                    result=a/b;

                }
                break;
                default:
                {
                    System.out.println("invalid operator");
                    valid=false;
                }
                
                
            }
            if(valid)
            {
                System.out.format("Result: %.1f\n",result);
            }
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception: "+e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception:"+e.getMessage());
        }
        finally{
            in.close();
        }
    }
    
}
