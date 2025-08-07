import java.util.*;
public class megna 
{
    public static class Array<T extends Number>
    {
        public T[] a;
        public int n;
    

    public Array(T[] a, int n)
    {
        this.a=a;
        this.n=n;
    }
    public void calculateSum(T[] a ,int n )
    {
        double c=0.0;
        for(int i=0;i<n;i++)
        {
            c+=a[i].doubleValue();
        }
        System.out.println((int)c);
    }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        Integer[] arr = new Integer[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=in.nextInt();
        }
        Array<Integer> at = new Array<>(arr,num);
        at.calculateSum(arr,num);
        in.close();
    }
    
}
