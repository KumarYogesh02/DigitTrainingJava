package fileInputOutput;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;



public class Fileop5 {
	public static void main(String[] args) throws Exception {

		
		
		FileInputStream fis= new FileInputStream("D:\\fileops\\cricketer.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		criketer c=(criketer)ois.readObject();
		c.display();
		
	}

}