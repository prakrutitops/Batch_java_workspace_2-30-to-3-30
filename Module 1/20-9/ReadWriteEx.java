import java.io.*;
import java.io.IOException;

public class ReadWriteEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		/*
		 * String s = "Hello , this is my data"; FileWriter fw = new
		 * FileWriter("E://tops1.txt"); fw.write(s); fw.close();
		 */
		

		  FileReader fr = new FileReader("E://tops1.txt"); int i=0;
		  while((i=fr.read())!=-1) { System.out.print((char)i); }
		 
	
	}
}
