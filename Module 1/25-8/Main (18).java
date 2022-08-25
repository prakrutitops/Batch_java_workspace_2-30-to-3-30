import java.util.*;

public class Main
{
    public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);         
        
        
        System.out.println("Enter your id");
        int id=sc.nextInt();
        
        System.out.println("Enter your name");
        String name=sc.next();
        
        System.out.println("Enter your Salary");
        double salary =  sc.nextDouble();
        
        System.out.println(id+" "+name+" "+salary);
        
        if(salary>=50000)
        {
            System.out.println("It's Good");    
        }
        else
        {
            System.out.println("Need Improvement");
        }
	}
}
