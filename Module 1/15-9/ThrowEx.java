
public class ThrowEx 
{
	static void validate(int age) 
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			//throw new ArithmeticException("Not Valid");
			new  MyException();
		}
	}
	
	public static void main(String[] args) 
	{
		
		validate(15);
	}
}
