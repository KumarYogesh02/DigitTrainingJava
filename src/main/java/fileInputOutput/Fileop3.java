package fileInputOutput;

import java.io.File;
import java.io.IOException;

public class Fileop3 {
	public static void main(String[] args) throws IOException {
		String path="D:\\fileops\\vipul.txt";
		File f= new File(path);
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getFreeSpace());

	}
}
