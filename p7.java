import java.util.*;
public class p7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        try
        {
            int n = in.nextInt();
            int arr[];
            arr=new int [5];
            int c=0;
            for(int i=0;i<5;i++)
            {
                arr[i]=in.nextInt();
                c+=i;
            }
            if(c==n)
            {
                System.out.println("Array:");
                for(int i=0;i<5;i++)
                {
                    System.out.println(arr[i]);
                }
            
            }
            else{
                throw new ArrayIndexOutOfBoundsException();
            }
            
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException :"+e.getMessage());
        }
        finally{
            System.out.println("Program executed successful");
            in.close();
        }
    }
    
}
