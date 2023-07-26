package fileInputOutput;

import java.util.ArrayList;
import java.util.Comparator;
class cricketer{
	int cid;
	String name;
	int runs;
	int wickets;
	int catches;
	public cricketer(int cid, String name, int runs, int wickets, int catches) {
		super();
		this.cid = cid;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
	}
	public String toStrig() {
		return cid+"-"+name+"-"+runs+"-"+wickets+"-"+catches;
	}
}
class Alpha implements Comparator{
	@Override
	public int compare(Object x, Object y) {
	if(((cricketer)x).runs>((cricketer)y).runs){
		return 1;
	}else {
		return -1;
	}
		
	}
}


public class CamparatorIN {
	public static void main(String[] args) {
		ArrayList<cricketer> al= new ArrayList<cricketer>();
		cricketer c1= new cricketer(1,"yash",3223,32,40);
		cricketer c2= new cricketer(2,"yogesh",3233,30,10);
		cricketer c3= new cricketer(3,"rahul",3233,30,10);
		
		
	}
	
}
