
import java.util.Scanner;
public class tyu {

	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
		try
		{
			
			String num1 = in.nextLine();
			String num2 = in.nextLine();
			in.nextLine();
			double a =Double.parseDouble(num1);
			double b = Double.parseDouble(num2);
			double result;
			if(b==0)
			{
				throw new ArithmeticException();
			}
			result=a/b;
			System.out.format("Result %.1f\n",result);
			
		}
		catch(NumberFormatException | ArithmeticException  e)
		{
			if(e instanceof NumberFormatException)
			{
				System.out.println("Invalid number format: "+ e.getMessage());
			}
			else if (e instanceof ArithmeticException)
			{
				System.out.println("Arithmetic exception: Cannot divide by zero");
			}
		}
		
	}

}