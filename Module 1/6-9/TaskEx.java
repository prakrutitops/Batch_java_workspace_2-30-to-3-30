import java.util.Scanner;


public class TaskEx 
{
	public static void main(String[] args) {
		
		System.out.println("Enter Any Character");
		
		Scanner sc =new Scanner(System.in);
		/*String s = sc.next();
		
		if(s.length()>1)
		{
			System.out.println("Error");
		}
		else
		{
			System.out.println("Executed");
		}*/
		
		char ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		
		
		
	}
}
