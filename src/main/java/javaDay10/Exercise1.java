package javaDay10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Exercise1 implements Serializable {

	private String name;
	private String car;
	private int age;

	public Exercise1(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		DataInputStream dis = new DataInputStream(System.in);

		String nameString = "";
		int age = 0;

		try {
			System.out.println("Enter a name");
			nameString = dis.readLine();

			System.out.println("Enter a age");
			age = dis.read();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Exercise1 e1 = new Exercise1(nameString, age);
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("example.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			oos.writeObject(e1);
			oos.close();
			dos.close();
			System.out.println("sucess");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}