interface A11
{
	void a11();
	
}
interface B11 
{
	void b11();
}

class C11 implements A11,B11
{

	public void b11() {
		// TODO Auto-generated method stub
		System.out.println("b11");
	}

	public void a11() {
		// TODO Auto-generated method stub
		System.out.println("a11");
	}
	public void c11()
	{
		System.out.println("c11");
		
	}
}
public class MultipleEx 
{
	public static void main(String[] args) {
		
		C11 c =new C11();
		
		c.a11();
		c.b11();
		c.c11();
	}
}
