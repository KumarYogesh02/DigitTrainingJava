package fileInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileop {
	public static void main(String[] args) throws Exception {
		String path1="D:\\fileops\\Input.txt";
		String path2="D:\\fileops\\Output.txt";
		FileInputStream fis= new FileInputStream(path1);
		int temp;
		FileOutputStream fout= new FileOutputStream(path2);
		
		while((temp=fis.read())!=-1) {
			fout.write(temp);
			
		}
	//	System.out.println(temp);
		fout.close();
		fis.close();
		
	}

}
