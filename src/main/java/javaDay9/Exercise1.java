package javaDay9;

import java.util.Calendar;

// javaDay 9 Exercise 1,2
public class Exercise1 extends Thread {

	public static void main(String[] args) {
		Thread t1 = new Thread();

		// Assign current thread to T1
		t1 = Thread.currentThread();

		// Print out current thread name
		System.out.println("Current name " + t1.getName());

		// Set new name to MyThread
		t1.setName("MyThread");

		// Show changed named and current time
		System.out.println("Changed name " + t1.getName());
		System.out.println("Current time: " + Calendar.getInstance().getTime());

		// Sleep thread for 10 seconds
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Show current time
		System.out.println("Current time: " + Calendar.getInstance().getTime());
	}
}
