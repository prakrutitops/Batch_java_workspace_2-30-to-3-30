//when two or more methods having a same name but number of parameters are diffrent

public class OverloadingEx 
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args)
	{
		
		System.out.println(add(5, 6));
		System.out.println(add(2, 3, 4));
		System.out.println(add(2,3));
	}
}
