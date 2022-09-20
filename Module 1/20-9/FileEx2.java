import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileEx2 
{
	public static void main(String[] args) {
		
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Your Name :- ");
			String n = s.nextLine();
			System.out.print("Enter Your city :- ");
			String c = s.nextLine();
			System.out.print("Enter Your age :- ");
			String a = s.nextLine();
			//String s="Welcome to tops";
			FileOutputStream fout =new FileOutputStream("E://parth1.txt");
			String name="Enter your name: ";
			fout.write(name.getBytes());
			fout.write(n.getBytes());
			System.out.println("\n ");
			String city="Enter your city: ";
			fout.write(city.getBytes());
			fout.write(c.getBytes());
			System.out.println();
			
			fout.write(a.getBytes());
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success Input Your Data ");
		
	}
}
