package day12;


import java.util.Scanner;

public class Singlebookmangament {
public static void main(String[] args) {
	Book book=new Book("dopamaine detox","lucky",152.6,5);
	System.out.println(book);
	Scanner sc = new Scanner(System.in);
	boolean istrue=true;
	
	int choice;
	
	while (istrue) {
		System.out.println("Enter the requried option : ");
		System.out.println(" 1 -> for Add/update book details : ");
		System.out.println(" 2 -> for constructor method : ");
		System.out.println(" 3 -> for display the book details : ");
		System.out.println(" 0 -> for exit the program : ");
		
		System.out.println("");
		System.out.println("choose the option : ");
		
		int details = sc.nextInt();
		sc.nextLine();
		switch (details) {
		case 1: {
			System.out.println("enter the title : ");
			String title=sc.nextLine();
			book.setTitle(title+"\n");
			System.out.println("enter the author : ");
			String author=sc.nextLine();
			book.setAuthor(author+"\n");
			System.out.println(" \n enter the price : ");
			double price=sc.nextDouble();
			book.setPrice(price);
			System.out.println("\n enter the no.of.copies : ");
		
			int numofcopies=sc.nextInt();
			book.setNumofcopies(numofcopies);
			System.out.println(" successfully added ");
			break;
		}
		case 2: {
			System.out.println("enter the title : ");
			String title=sc.nextLine();
			System.out.println("enter the author : ");
			String author=sc.nextLine();
			System.out.println("enter the price : ");
			double price=sc.nextDouble();
			System.out.println("enter the no.of.copys : ");
			int numofcopies=sc.nextInt();
			book=new Book(title,author,price,numofcopies);
			System.out.println(book);
				
				
			break;
			
		}
		case 3:{
			System.out.println("");
			System.out.println(book);
			System.out.println("");
		
		break;	
		}
		case 0:{
			istrue=false;
			System.out.println("you are  exited");
			break;
		}
		
		
		default:{
			System.out.println("enter the correct option ");
		}
			
			
		}
		
		
	}
	
	
	
	}
	
}

