import java.util.*;
int decimaltobinary(int num)
{
    int[] b = new int[10];
    int i=0;
    while(num>0)
    {
        b[i]=num%2;
        num=num/2;
        i++;
    }
    if(i==2)
    {
        return i;
    }
    else
    {
        return -1;
    }
}
public class binary 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;
        for(int i=0;i<n;i++)
        {
            x=in.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=x;j++)
            {
                int result=decimaltobinary(j);
                s+=result;
            }
            System.out.println(s);
        }
        

    }
    
}
