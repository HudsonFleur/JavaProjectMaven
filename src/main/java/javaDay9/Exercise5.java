package javaDay9;

public class Exercise5 implements Runnable{
	
	public int num = 0;
	public Exercise5(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Thread t1 = new Thread();
		
		System.out.println( Thread.currentThread().getName() + " Beginning");
		
		System.out.println(Thread.currentThread().getState());
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(num * i);
			
		}
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getName() + " End" + "\n");
		
	}
	
	public static void main(String[] args) {
		Exercise5 e1 = new Exercise5(2);
		Exercise5 e2 = new Exercise5(5);
		Exercise5 e3 = new Exercise5(8);
		
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		Thread t3 = new Thread(e3);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
