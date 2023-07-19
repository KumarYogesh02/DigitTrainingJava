package com.digit.test.proj.p1;

import java.util.Scanner;

class WrongPassword extends Exception{
	public String getMessage() {
		return "Your password is wrong";
		
	}
}


class Authenticate{
	
	int pass;
	int a=1234;
	
	void getData() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the password");
	int Pass=sc.nextInt();
	}
	
	void verify () throws Exception{
		
	
		if(pass-a==0){
			System.out.println("It is correct");
			
		}
		else 
		{
			WrongPassword wp= new WrongPassword();
			System.out.println(wp.getMessage());
			throw wp;
		}
	}
}
class checking{
	void grantPermission(Authenticate c) {
		try {
			c.getData();
			c.verify();
		}
		catch(Exception e){
			try {
				c.getData();
				c.verify();
			}catch(Exception e1){
				
				try {
					c.getData();
					c.verify();
				}catch(Exception e2) {
					System.out.println("GO HOME YOUR ACCOUNT IS BANNED NOW");
				}
				
			}
		}
	}
	
}


public class Password_Match {
	
public static void main(String[] args) {
	
	Authenticate au= new Authenticate();
	checking c= new checking();
	c.grantPermission(au);
	
	}
}
