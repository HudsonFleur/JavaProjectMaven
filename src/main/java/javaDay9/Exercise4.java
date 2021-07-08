package javaDay9;

public class Exercise4 extends Thread{
	
	public Exercise4()
	{
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				for(int i = 1; i <= 10; i++)
				{
					System.out.println("Running child Thread in loop: " + i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t1.start();
	}
	
	
	
	public static void main(String[] args) {
		Exercise4 e1 = new Exercise4();
		Exercise4 e2 = new Exercise4();
		Exercise4 e3 = new Exercise4();
	}
}
