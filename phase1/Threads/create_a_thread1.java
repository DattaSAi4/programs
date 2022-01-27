package Threads;

 class bus implements Runnable {

	@Override
	public void run() {
	 System.out.println("the bus is running......");
		
	}
}
	public class create_a_thread1 {
		public static void main(String[] args)
		{
			bus b1 = new bus();
			Thread t1 = new Thread(b1);
			t1.start();
		}
}
