import java.util.*;
import java.math.*;
public class p6 
{
    public static void solveQuadraticEquation(double a,double b,double c)
    {
        double d=b*b-4*a*c;
        if(d<0)
        {
            throw new IllegalArgumentException("Error");

        }
        else
        {
            double r1 = (-b+Math.sqrt(d))/(2*a);
            System.out.format("Root 1 : %.1f\n",r1);
            double r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.format("Root 2 : %.1f\n",r2);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        try
        
        {
            double a =in.nextDouble();
            double b =in.nextDouble();
            double c =in.nextDouble();
            solveQuadraticEquation(a,b,c);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        finally{
            in.close();

        }
    }
}
