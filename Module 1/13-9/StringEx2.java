
public class StringEx2 
{
	public static void main(String[] args) {
		
		String s1="sachin";
		String s2="sachin";
		String s3="saurav";
		String s4 =new String("sachin");
		String s5="SACHIN";
		String s6="  tops  ";
		String s7="java is a programming language,java is a platform";
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s5.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.charAt(0));
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s6.trim());
	
		System.out.println(s7.replace("java","tops"));
	}
}
