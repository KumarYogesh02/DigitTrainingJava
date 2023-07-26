package MapsTest;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Program1 {
	public static void main(String[] args) {
		//HashMap<String, Integer> hm= new HashMap<>();//give output in descending order in alphabe
		//LinkedHashMap<String, Integer> hm= new LinkedHashMap<>();//give output according to the giving input
		TreeMap<String, Integer> hm= new TreeMap<>();//give output according to the alphabatically.
		
		
		hm.put("Arjun",1);
		hm.put("Karan",2);
		hm.put("Chandu",3);
		hm.put("Kapil",4);
		hm.put("Aakash",5);
		hm.put("Kalash",6);
		
		
		
		System.out.println(hm);
	}

}
