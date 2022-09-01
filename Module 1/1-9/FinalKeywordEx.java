/*
 * 
 * 
 * this
 * static->variable,method,block
 * super->parent class call
 * final->variable,method,class
 * 
 * 
 */

final class P
{
	
}
public class FinalKeywordEx extends P
{
	
	final void a()
	{
		
	}
	void a()
	{
		
	}
	public static void main(String[] args) 
	{
		
		final int speed=90;
		
		speed=120;
		
		System.out.println(speed);
		
	}
	
}
