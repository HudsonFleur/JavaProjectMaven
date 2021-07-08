package javaDay9;

import java.util.Calendar;

public class Exercise1 extends Thread {

	public static void main(String[] args) {
		Thread t1 = new Thread("Thread1");

		System.out.println("Current name " + t1.getName());

		t1.setPriority(MAX_PRIORITY);
		t1.setName("Thread2");

		System.out.println("Changed name " + t1.getName());
		System.out.println("Current time: " + Calendar.getInstance().getTime());

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Current time: " + Calendar.getInstance().getTime());
	}
}
