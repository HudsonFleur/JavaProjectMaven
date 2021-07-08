package javaDay9;

public class Exercise4 extends Thread{
	public Exercise4() {
		// TODO Auto-generated constructor stub
		Thread t1 = new Thread();
		t1.start();
		run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("Running child Thread in loop : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Exercise4 e1 = new Exercise4();
		Exercise4 e2 = new Exercise4();
		Exercise4 e3 = new Exercise4();
	}
}
