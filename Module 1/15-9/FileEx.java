import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileEx 
{
	public static void main(String[] args) {
		
		try 
		{
		
			String s="Welcome to tops";
			FileOutputStream fout =new FileOutputStream("E://parth.txt");
			fout.write(s.getBytes());
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
		
	}
}
