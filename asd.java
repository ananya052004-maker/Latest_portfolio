
import java.util.Scanner;
public class asd {

	public static void main(String[] args) 
	{
		try
		{
			Scanner in = new Scanner(System.in);
			String num1 = in.nextLine();
			String num2 = in.nextLine();
			in.nextLine();
			double a =Double.parseDouble(num1);
			double b = Double.parseDouble(num2);
			char s = in.nextLine().charAt(0);
			double result;
			boolean valid =true;
			switch(s)
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
					throw new ArithmeticException();
					valid=false;
				}
				result=a/b;
				
				break;
			default:
			{
				throw new StringIndexOutOfBoundsException(Character.toString(s));
				valid=false;
			}
			
				
			}
			if(valid)
			{
				System.out.format("Result %.1f\n",result);
			}
			
		}
		catch(NumberFormatException | ArithmeticException | StringIndexOutOfBoundsException e)
		{
			if(e instanceof NumberFormatException)
			{
				System.out.println("Invalid number format: "+ e.getMessage());
			}
			else if (e instanceof ArithmeticException)
			{
				System.out.println("Arithmetic exception: Cannot divide by zero");
			}
			else if(e instanceof StringIndexOutOfBoundsException)
			{
				System.out.println("Invalid operation input: Invalid operation: " + e.getMessage());
			}
		}
		
		
	}

}
