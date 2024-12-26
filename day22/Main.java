package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Book lol = new Book("name","author",2,12.3);
	Scanner sc =new Scanner(System.in);
	ArrayList<Book> on = new ArrayList<Book>();
	boolean istrue =true;
	while(istrue){
			

	System.out.println("Enter the option");
	System.out.println("1 for add");
	System.out.println("2 for show");
	System.out.println("3 for update");
	System.out.println("4 for remove");
	System.out.println("0 for exit");
	
	int var=sc.nextInt();
	sc.nextLine();
	
	if(var==1) {
		System.out.println(" Enter the book name : " );
		String bookname =sc.nextLine();
		System.out.println(" Enter the Author : " );
		String Author =sc.nextLine();
		System.out.println(" Enter the no.of.copies : " );
		int noofcopies =sc.nextInt();
		System.out.println(" Enter the Price : " );
		double price =sc.nextDouble();
		
		on.add(lol=new Book(bookname,Author,noofcopies,price));
	}
	else if(var==2) {
		System.out.println("");
		System.out.println(on);
		System.out.println("");

	}
	else if (var==3) {
		
		System.out.println("Enter the book name : ");
		String nameB=sc.nextLine();
		for(Book bname : on) {
			if (nameB.equalsIgnoreCase(bname.getBookname())) {
				System.out.println(" Enter the new book name : " );
				String bookname =sc.nextLine();
				
				System.out.println(" Enter the Author : " );
				String Author =sc.nextLine();
				System.out.println(" Enter the no.of.copies : " );
				int noofcopies =sc.nextInt();
				sc.nextLine();
				System.out.println(" Enter the Price : " );
				double price =sc.nextDouble();
				bname.setBookname(bookname);
				bname.setAuthor(Author);
				bname.setNoofcopies(noofcopies);
				bname.setPrice(price);

			}
			
		}
		
		
	}else if(var==4) {
		System.out.println("remove the book : ");
		String remov=sc.nextLine();
		for(Book rem : on) {
			if (remov.equalsIgnoreCase(rem.getBookname())) {
				on.remove(rem);
				break;
			}
			
		}
		
		
	}
	
	}
}
}
