import java.util.Scanner;
public class p3 {

	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
		try
		{
			
			String num1 = in.nextLine();
			String num2 = in.nextLine();
			double a =Double.parseDouble(num1);
			double b = Double.parseDouble(num2);
			char s = in.nextLine().charAt(0);
			double result=0.0;
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
                    valid=false;
					throw new ArithmeticException();
					
				}
                else
                {
                    result=a/b;
                }
				
				break;
			default:
			{
                valid=false;
				throw new StringIndexOutOfBoundsException(Character.toString(s));
				
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
        finally{
            in.close();
        }
		
		
	}

}

