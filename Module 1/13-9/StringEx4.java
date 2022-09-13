
public class StringEx4 
{
	public static void main(String[] args) {
		
		StringBuffer b =new StringBuffer("Hello");
		
		//b.append(" Java");
		
		//b.insert(1, "Java");
		 //b.delete(1, 3);
		//b.reverse();
		b.replace(1, 3, "Java");
		System.out.println(b);
		
	}
}


