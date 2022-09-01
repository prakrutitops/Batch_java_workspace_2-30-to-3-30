//super keyword call parent class value

class A111
{
	String color="black";
}
class B111 extends A111
{
	String color="white";
	
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
		
	}
	
}
public class SuperEx 
{
	public static void main(String[] args) 
	{
		B111 b =new B111();
		
		b.display();
	}
}
