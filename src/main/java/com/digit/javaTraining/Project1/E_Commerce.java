package com.digit.javaTraining.Project1;

//Project 1 e-commerce 




import java.util.Scanner;



abstract class categories {

String cat[] = { "Electronics", "Fashion", "Groceries", "Furniture", "Books" };



abstract void category();

}



class subcategories extends categories {



String subcat[][] = {



//Electronics

{ "Laptop", "Mobile", "Wearables", "TV" },



//Fashion

{ "Men", "Women", "Kids", "Watches" },



//Groceries

{ "Snacks", "Household Care", "Skin Care", "Beverages" },



//Furniture

{ "Sofa", "Table", "Bed", "Wardrobe" },



//Books

{ "Fiction", "Health and Fitness", "Children", "Education" } };



@Override

void category() {

for (int i = 0; i < 5; i++) {

System.out.println((i + 1) + ". " + cat[i]);//1.Electronics 2.Fashion 3.Groceries 4.Furniture 5.Books

}

}

}



class products extends subcategories {

String Prod[][] = {



//Laptops

{ "Dell", "HP", "Lenovo", "Acer", "Asus" },



//Mobiles

{ "Vivo", "Oppo", "Samsung", "Apple", "OnePlus" },



//Wearables

{ "Fire Boltt", "Noise", "Boat", "Fastrack", "Fossil" },



//TV's

{ "LG", "Samsung", "Sony", "TCL", "Acer" },



//Men

{ "Ethnic Wear", "Casuals", "Formals", "Sports Wear", "Party Wear" },



//Women

{ "Ethnic Wear", "Casuals", "Formals", "Sports Wear", "Party Wear" },



//Kids

{ "Ethnic Wear", "Casuals", "Formals", "Sports Wear", "Party Wear" },



//Watches

{ "Titan", "Fastrack", "Diesel", "Fossil", "Sonata" },



//Snacks

{ "Biscuites", "Chips", "Sweets", "Chocolates", "Pickles" },



//Household Care

{ "Air Fresheners", "Glass Cleaner", "Storage Containers", "Floor Cleaner", "Laundry Essentials" },



//Skin Care

{ "Face Wash", "Creams", "Lotions", "Soaps", "Talcs" },



//Beverages

{ "Soft Drinks", "Health Drinks", "Coffee", "Tea", "Energy Drinks" },



//Sofa

{ "Nilkamal", "Durian", "Furny", " Wooden Street", "Vittoria" },



//Table

{ "Wood Buzz", "Furinno", "Bluewud", "Feather Lite", "Space wood" },



//Bed

{ "Wakefit", "Furniture Kart", "Nilkamal", "Sleep Well", "Kurlon" },



//Wardrobe

{ "Space Wood", "Cello", "Trevi ", "Clixfurn", "Star Wood" },



//Fiction

{ "Harry Potter", "Alien", "Avengers", "Spider Man", "Guardians of the Galaxy" },



//Health and Fitness

{ "Hacking Health", "Fitness Habits", "Food Guide", "The Fitness Mindset", "Why We Sleep" },



//Children

{ "Doraemon", "Shinchan", "Tarzan", "Aladdin", "Ninja Hattori" },



//Education

{ "Artificial Intelligence", "Networking", "Operating Systems", "Data Analytics", "Software Design" }, };

}



class description extends products {

String desc[][] = {

//Laptops

{ "Dell\ni5\n10th gen\nRs. 47000", "HP", "Lenovo", "Acer", "Asus" },



//Mobiles

{ "Vivo", "Oppo", "Samsung", "Apple", "OnePlus" },



//Wearables

{ "Fire Boltt", "Noise", "Boat", "Fastrack", "Fossil" },



//TV's

{ "LG", "Samsung", "Sony", "TCL", "Acer" },



//Men

{ "Ethnic Wear", "Casuals", "Formals", "Sports Wear", "Party Wear" },



//Women

{ "Ethnic Wear", "Casuals", "Formals", "Sports Wear", "Party Wear" },



//Kids

{ "Ethnic Wear", "Casuals", "Formals", "Sports Wear", "Party Wear" },



//Watches

{ "Titan", "Fastrack", "Diesel", "Fossil", "Sonata" },



//Snacks

{ "Biscuites", "Chips", "Sweets", "Chocolates", "Pickles" },



//Household Care

{ "Air Fresheners", "Glass Cleaner", "Storage Containers", "Floor Cleaner", "Laundry Essentials" },



//Skin Care

{ "Face Wash", "Creams", "Lotions", "Soaps", "Talcs" },



//Beverages

{ "Soft Drinks", "Health Drinks", "Coffee", "Tea", "Energy Drinks" },



//Sofa

{ "Nilkamal", "Durian", "Furny", " Wooden Street", "Vittoria" },



//Table

{ "Wood Buzz", "Furinno", "Bluewud", "Feather Lite", "Space wood" },



//Bed

{ "Wakefit", "Furniture Kart", "Nilkamal", "Sleep Well", "Kurlon" },



//Wardrobe

{ "Space Wood", "Cello", "Trevi ", "Clixfurn", "Star Wood" },



//Fiction

{ "Harry Potter", "Alien", "Avengers", "Spider Man", "Guardians of the Galaxy" },



//Health and Fitness

{ "Hacking Health", "Fitness Habits", "Food Guide", "The Fitness Mindset", "Why We Sleep" },



//Children

{ "Doraemon", "Shinchan", "Tarzan", "Aladdin", "Ninja Hattori" },



//Education

{ "Artificial Intelligence", "Networking", "Operating Systems", "Data Analytics", "Software Design" }, };

}



class purchase {

Scanner sc = new Scanner(System.in);



void confirm() {

System.out.println("Enter yes to confirm your purchase :");

String buy = sc.next();

if (buy.equals("yes")) {

System.out.println("Your purchase is successful");

System.out.println("If you want to go to menu then enter Main. If you want to exit then enter 0");

} else {

System.out.println("Your purchase is unsuccessful \nTry again");

System.out.println("If you want to exit then enter 0");

if(buy.equals("0")) {

System.out.println("Exiting....");

System.out.println("Exit");

System.exit(0);

}

confirm();

}


}

}



class shop {

void shopping() {

Scanner sc = new Scanner(System.in);

System.out.println("select one of the options from the follwing : ");

description d = new description();

purchase pur = new purchase();

d.category(); //1.Electronics 2.Fashion 3.Groceries 4.Furniture 5.Books

System.out.println("Select category : ");

int cat = sc.nextInt();



while (cat < 1 || cat > 5) {

System.out.println("Please select options from 1 to 5 only. If you want to exit then enter 0");

cat = sc.nextInt();

if (cat == 0) {

//System.out.println("Thank you for choosing Digit");

System.out.println("Exiting....");

System.out.println("Exit");

}

}

for (int j = 1; j <= 4; j++) {

System.out.println(j + ". " + d.subcat[cat - 1][j - 1]);//1.d.subcat[1-1][1-1]=1.d.subcat[0][0]=1.Dell

}

System.out.println("Select category : ");

int subcat = sc.nextInt();

while (subcat < 1 || subcat > 4) {

System.out.println("Please select options from 1 to 4 only. If you want to exit then enter 0");

subcat = sc.nextInt();

if (subcat == 0) {

//System.out.println("Thank you for choosing Digit");

System.out.println("Exiting....");

System.out.println("Exit");

}

}

for (int j = 1; j <= 5; j++) {

System.out.println(j + ". " + d.Prod[4 * (cat - 1) + (subcat - 1)][j - 1]);//for subcategory item

}

System.out.println("Select Product : ");

int pro = sc.nextInt();

while (pro < 1 || pro > 5) {

System.out.println("Please select options from 1 to 5 only. If you want to exit then enter 0");

pro = sc.nextInt();

if (pro == 0) {

//System.out.println("Thank you for choosing Digit");

System.out.println("Exiting....");

System.out.println("Exit");

}

}

System.out.println("Description : ");

System.out.println(d.desc[4 * (cat - 1) + (subcat - 1)][pro - 1]);

pur.confirm();//calling purchase confirm method

}

}



public class E_Commerce  {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

shop s = new shop();

System.out.println("Welcome to Digital Shopping");

s.shopping();

String str = sc.next();

while (str.equals("Main")) {

s.shopping();

str = sc.next();

}

if (str != "Main") {

System.out.println("Exiting......");

System.out.println("Exit");

}

}

}


