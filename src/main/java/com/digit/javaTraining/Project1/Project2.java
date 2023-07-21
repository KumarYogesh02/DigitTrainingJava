package com.digit.javaTraining.Project1;


	//Project 2




	import java.util.Scanner;



	class candidate {

	private String Name;

	private int Age;

	private String City;



	public void setName(String name) {

	Name = name;

	}



	public void setAge(int age) {

	Age = age;

	}



	public void setCity(String city) {

	City = city;

	}



	void disp() {

	System.out.println("Name : " + Name + "\nAge : " + Age + "\nCity : " + City);

	}

	}



	class lifeline {

	String l[] = {"1. 50-50", "2. Poll"};

	boolean l1[] = { true, true };


	}



	class fifty50 extends lifeline {

	String f50[] = {



	// Question 1

	"1. Which of the following is a not a piller of oops  \n   1. Class    2.     3. Polymorphism    4.     5. ll",



	// Question 2

	"2. Which of these return types does not return any value  \n   1. int    2. void    3.     4.     5. ll",



	// Question 3

	"3. Which is the extension of java code files  \n   1.     2.     3. java    4. class    5. ll",



	// Question 4

	"4. extends keyword is used by  \n   1.     2. Inheritance    3.     4. Polymorphism    5.ll",



	// Question 5

	"5. Who invented java  \n   1.     2.     3. Guido Van Rossum    4. James Gosling    5. ll",



	// Question 6

	"6. Which of the following are not belongs to loops  \n   1.     2.     3. if    4. do while    5. ll",



	// Question 7

	"7. Which of the following is not belongs to variable types  \n   1.     2.     3. Static    4. Void    5. ll",



	// Question 8

	"8. Local variables in java store in which of the following segment  \n   1. Stack    2.     3. Heap    4.     5. ll",



	// Question 9

	"9. Which of the following do not follow the identifier rule  \n   1.     2.     3. _abcd    4. #ab$bc    5. ll",



	// Question 10

	"10. Which of the following is used to avoid shadowing problem  \n   1. super    2.     3. this    4.     5.ll",

	};

	}



	class poll extends lifeline {

	String p[] = {



	// Question 1

	"1. Which of the following is not a piller of oops  \n   1. Class-------------65%\n   2. Abstraction-------15%\n   3. Polymorphism------5%\n   4. Encapsulation-----15%",



	// Question 2

	"2. Which of these return types does not return any value  \n   1. int-------3%\n   2. void------85%\n   3. double----5%\n   4. float-----7%",



	// Question 3

	"3. Which is the extension of java code files  \n   1. txt-----10%\n   2. js------30%\n   3. java----45%\n   4. class----15%",



	// Question 4

	"4. extends keyword is used by  \n   1. Encapsulation----20%\n   2. Inheritance-------60%\n   3. Abstraction------10%\n   4. Polymorphism------10%",



	// Question 5

	"5. Who invented java  \n   1. Bjarne Stroustrup---8%\n   2. Dennis Ritchie------10%\n   3. Guido Van Rossum----40%\n   4. James Gosling-------42%",



	// Question 6

	"6. Which of the following are not belongs to loops  \n   1. for--------20%\n   2. while------30%\n   3. if---------26%\n   4. do while---24%",



	// Question 7

	"7. Which of the following is not belongs to variable types  \n   1. Local------20%\n   2. Instance---15%\n   3. Static-----25%\n   4. Void-------40%",



	// Question 8

	"8. Local variables in java store in which of the following segment  \n   1. Stack----45%\n   2. Static---15%\n   3. Heap-----30%\n   4. Code-----10%",



	// Question 9

	"9. Which of the following do not follow the identifier rule  \n   1. $abc_----30%\n   2. a$b_c----20%\n   3. _abcd----15%\n   4. #ab$bc---35%",



	// Question 10

	"10. Which of the following is used to avoid shadowing problem  \n   1. super------26%\n   2. this()-----27%\n   3. this-------29%\n   4. super()----18%",

	};

	}



	class questions {

	String ques[] = {



	// Question 1

	"1. Which of the following is not a piller of oops  \n   1. Class    2. Abstraction    3. Polymorphism    4. Encapsulation    5. ll",



	// Question 2

	"2. Which of these return types does not return any value  \n   1. int    2. void    3. double    4. float    5. ll",



	// Question 3

	"3. Which is the extension of java code files  \n   1. txt    2. js    3. java    4. class    5. ll",



	// Question 4

	"4. extends keyword is used by  \n   1. Encapsulation    2. Inheritance    3. Abstraction    4. Polymorphism    5.ll",



	// Question 5

	"5. Who invented java  \n   1. Ben    2. Dennis    3. Guido Van Rossum    4. James Gosling    5. ll",



	// Question 6

	"6. Which of the following are not belongs to loops  \n   1. for    2. while    3. if    4. do while    5. ll",



	// Question 7

	"7. Which of the following is not belongs to variable types  \n   1. Local    2. Instance    3. Static    4. Void    5. ll",



	// Question 8

	"8. Local variables in java store in which of the following segment  \n   1. Stack    2. Static    3. Heap    4. Code    5. ll",



	// Question 9

	"9. Which of the following do not follow the identifier rule  \n   1. $abc_    2. a$b_c    3. _abcd    4. #ab$bc    5. ll",



	// Question 10

	"10. Which of the following is used to avoid shadowing problem  \n   1. super    2. this()    3. this    4. super()    5.ll",

	};



	String ans[] = { "1", "2", "3", "2", "4", "3", "4", "1", "4", "3" };



	String amt[] = { "0", "10000", "20000", "30000", "40000", "50000", "200000", "400000", "600000", "800000", "1000000" };

	}



	class life {

	Scanner sc = new Scanner(System.in);

	questions q = new questions();

	candidate c = new candidate();

	lifeline li = new lifeline();

	fifty50  f = new fifty50();

	poll p = new poll();

	String cor;

	void lifeline(int i) {

	int count = 0;

	System.out.println("Available lifelines : ");

	for (int j = 0; j < 2; j++) {

	if (li.l1[j] == true) {

	System.out.println(li.l[j] + "  ");

	count++;

	}

	}

	if(count>0) {

	System.out.println("Select available lifelines");

	int l = sc.nextInt();

	if(li.l1[l-1]==true && l==1) {

	System.out.println(f.f50[i]);

	li.l1[l-1] = false;

	String ans1 = sc.next();

	if (ans1.equals(q.ans[i])) {

	cor = "correct";

	System.out.println("Correct answer");

	System.out.println("you won Rs." + q.amt[i+1]);

	}

	else if(ans1.equals("5")){

	lifeline(i);

	}

	else {

	System.out.println("Wrong answer");

	System.out.println("you won Rs." + q.amt[i]);

	}

	}

	else if(li.l1[l-1]==true && l==2) {

	System.out.println(p.p[i]);

	li.l1[l-1] = false;

	String ans1 = sc.next();

	if (ans1.equals(q.ans[i])) {

	cor = "correct";

	System.out.println("Correct answer");

	System.out.println("you won Rs." + q.amt[i+1]);

	}

	else if(ans1.equals("5")){

	lifeline(i);

	}

	else {

	System.out.println("Wrong answer");

	System.out.println("you won Rs." + q.amt[i]);

	}


	}

	else {

	System.out.println("Select valid option");

	}

	}

	else {

	System.out.println("No lifelines available");

	String ans = sc.next();

	if (ans.equals(q.ans[i])) {

	cor = "correct";

	System.out.println("Correct answer");

	System.out.println("you won Rs." + q.amt[i=1]);

	}

	else {

	System.out.println("Wrong answer");

	System.out.println("you won Rs." + q.amt[i]);

	System.exit(0);

	}

	}

	}

	}



	public class Project2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	questions q = new questions();

	candidate c = new candidate();

	life lif = new life();

	System.out.println("Candidate Details :");

	c.setName("Yogesh");

	c.setAge(21);

	c.setCity("Nuh");

	c.disp();

	System.out.println();

	String cor = sc.next();

	for (int i = 0; i < 10; i++) {

	if (cor.equals("Start")) {

	System.out.println(q.ques[i]);

	}

	String ans = sc.next();

	if (ans.equals(q.ans[i])) {

	cor = "Start";

	System.out.println("Correct answer");

	System.out.println("you won Rs." + q.amt[i+1]);

	}

	else if (ans.equals("5")) {

	lif.lifeline(i);


	}

	else {

	System.out.println("Wrong answer");

	System.out.println("you won Rs." + q.amt[i]);

	
	System.exit(0);

	}

	if(i==9) {

	System.out.println("Caongractulations you are the winner.");

	}

	}

	}

	}

