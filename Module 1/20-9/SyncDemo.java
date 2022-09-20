class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending "+msg);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		System.out.println(msg+"sent");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class Threadsend extends Thread
{
	Sender sender;
	String msg;
	
	public Threadsend(Sender sender,String msg) 
	{
		// TODO Auto-generated constructor stub
		this.sender=sender;
		this.msg=msg;
	}
	public void run()
	{
		synchronized (sender) 
		{
			sender.send(msg);
		}
		
	}
}

public class SyncDemo 
{
	public static void main(String[] args) {
		
		Sender sender = new Sender();
		
		Threadsend t1 =new Threadsend(sender,"Hii");
		Threadsend t2 =new Threadsend(sender, "Byee");
		
		t1.start();
		t2.start();
		
	}
	
}
