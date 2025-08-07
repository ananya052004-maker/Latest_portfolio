import java.util.Scanner;

public class p4 

{
    public static void validateGrade(String s,int m)
    {
        if(m>0 && m<100)
        {
            System.out.println("Grade for"+s+":"+m);
        }
        else
        {
            throw new IllegalArgumentException("invalid grade");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        try
        {
            String s =in.nextLine();
            String marks = in.nextLine();
            int m = Integer.parseInt(marks);
            validateGrade(s,m);

        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid input :"+e.getMessage());

        }
        catch(IllegalArgumentException l)
        {
            System.out.println("Invalid grade :"+l.getMessage());
        }
        finally{
            in.close();
        }
    }
     
}
