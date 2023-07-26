package fileInputOutput;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Fileop1 {
	public static void main(String[] args) throws Exception {
		String path1="D:\\fileops\\Input.txt";
		String path2="D:\\fileops\\Output.txt";
		FileReader fr= new FileReader(path1);
		int temp;
		FileWriter fw= new FileWriter(path2);
		
		while((temp=fr.read())!=-1) {
			fw.write(temp);
			
		}
	//	System.out.println(temp);
		fr.close();
		fw.close();
		
	}

}
