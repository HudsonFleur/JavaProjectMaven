package javaDay9;

public class Exercise3 implements Runnable {

	public Exercise3() {
		// TODO Auto-generated constructor stub
		Thread t1 = new Thread(myRunnable);
		t1.start();
	}
	
	Runnable myRunnable = new Runnable() {
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
	};

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {

		Exercise3 e1 = new Exercise3();
		Exercise3 e2 = new Exercise3();
		Exercise3 e3 = new Exercise3();
	}
}
