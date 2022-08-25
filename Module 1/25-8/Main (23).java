import java.util.*;

public class Main
{
    int id;
    String name;
    
    
    Main(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    void display()
    {
        System.out.println(id+" "+name);
    }
    
    public static void main(String[] args) 
	{
       
        Main m1 =new Main(101,"Parth");
        Main m2 =new Main(102,"Harsh");
        
        m1.display();
        m2.display();
        
        
       
       
	}
}
