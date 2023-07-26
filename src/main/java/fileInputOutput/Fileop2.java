package fileInputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Fileop2 {
	public static void main(String[] args) throws Exception {
		String path1="D:\\fileops\\Input.txt";
		String path2="D:\\fileops\\Output.txt";
		FileReader fr= new FileReader(path1);
		BufferedReader br= new BufferedReader(fr);
		int temp;
		FileWriter fw= new FileWriter(path2);
		BufferedWriter bw= new BufferedWriter(fw);
		
		while((temp=br.read())!=-1) {
			bw.write(temp);
			
		}
	
		bw.flush();
		fw.flush();
		br.close();
		fr.close();
		
	}

}
