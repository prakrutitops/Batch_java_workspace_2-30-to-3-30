class Bank
{
	void bank(){
		System.out.println("banking");
	}
}
class Current extends Bank
{
	void current(){
		System.out.println("Current");
	}
}
class Save extends Bank
{
	void save(){
		System.out.println("Save");
	}
}
public class HierarchicalEx 
{
	public static void main(String[] args) {
	
		Current c =new Current();
		Save sa = new Save();
	
		c.current();
		sa.bank();
		sa.save();
	}
}
