package fileInputOutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class criketer implements Serializable{
	String name;
	transient String country;//transient is used not serialize data
	int age;
	int matches;
	int wickets;
	public criketer(String name,String country,int age, int matches, int wickets) {
		super();
		this.name= name;
		this.age=age;
		this.country=country;
		this.matches=matches;
		this.wickets=wickets;
	}
		
		void display() {
			System.out.println(name);
			System.out.println(country);
			System.out.println(age);
			System.out.println(matches);
			System.out.println(wickets);
	}
}

public class Fileop4 {
	public static void main(String[] args) throws Exception {
		criketer c= new criketer("virat","india",23,32,32);
		c.display();
		FileOutputStream fos= new FileOutputStream("D:\\fileops\\cricketer.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(c);
//		FileInputStream fis= new FileInputStream("D:\\fileops\\cricketer.txt");
//		ObjectInputStream ois= new ObjectInputStream(fis);
//		ois.readObject();
		
	}

}
