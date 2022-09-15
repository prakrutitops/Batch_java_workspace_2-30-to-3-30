import java.io.FileNotFoundException;
import java.io.IOException;

class M
{
	void m() throws IOException 
	{
		System.out.println("M Executed");
	}
}
class N extends M
{
	void n() throws IOException
	{
		m();
		System.out.println("N Executed");
	}
}
class P extends N
{
	void p()
	{
		try 
		{
			n();
			System.out.println("P Executed");
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class ThrowsEx 
{
	public static void main(String[] args) throws IOException {
		
		P p1 =new P();
		
		p1.m();
		p1.n();
		p1.p();
		
	}
}
