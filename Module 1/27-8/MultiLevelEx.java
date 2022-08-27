class A1
{
	void a1()
	{
		System.out.println("A1 Executed");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("B1 Executed");
	}
}
class C1 extends B1
{
	void c1()
	{
		System.out.println("C1 Executed");
	}
}
public class MultiLevelEx 
{
	public static void main(String[] args) {
		
		C1 c =new C1();
		
		c.a1();
		c.b1();
		c.c1();
		
	}
}
