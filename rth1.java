
import java.util.*;
public class rth1<T extends Number>
{
    private T Num;
    
    public rth1(T Num)
    {
        this.Num=Num;
    }
    public void calculate()
    {
        int n = Num.intValue();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");

            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }

        }

    }


public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int num= in.nextInt();
    rth1<Integer> f = new rth1<>(num);
    f.calculate();
    in.close();

}
}