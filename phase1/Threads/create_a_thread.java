package Threads;

class fruits extends Thread
{
	 int a =10;
	 int b =20;
	 public void run()
	 {
		 System.out.println("eating...");
	 }
	}

public class create_a_thread {
	public static void main(String[] args)
	{
		fruits t1 = new fruits();
		t1.start();
	}

}
