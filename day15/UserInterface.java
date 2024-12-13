package day15;

import java.util.Scanner;

public class UserInterface {
public static void main(String[] args) {
	Calculator user =new Calculator();
	Scanner sc = new Scanner(System.in);
	boolean istrue=true;
	
	while(istrue){
	System.out.println("Choose the option you need  ");
	System.out.println("Enter the 1 for add  ");
	System.out.println("Enter the 2 for sub  ");
	System.out.println("Enter the 3 for mul  ");
	System.out.println("Enter the 4 for div  ");
	System.out.println("Enter the 5 for Exit  ");
	System.out.println("");
	System.out.println("Enter the option you need : ");
	int choice =sc.nextInt();
	 if (choice==1) {
		 System.out.println("Enter the fnum : ");
		 int fnum=sc.nextInt();
			 System.out.println("Enter the fnum : ");
		 int snum=sc.nextInt(); 
		 System.out.println("");
		System.out.println("Answer :"+user.add(fnum, snum));
		System.out.println("");
		 
	 }
	 else if (choice==2){
		 System.out.println("Enter the fnum : ");
		 int fnum=sc.nextInt();
			 System.out.println("Enter the fnum : ");
		 int snum=sc.nextInt(); 
		 System.out.println("");
		 System.out.println("Answer : "+user.sub(fnum, snum));
		 System.out.println("");
		 
		 
	 }
	 else if (choice==3){
		 System.out.println("Enter the fnum : ");
		 int fnum=sc.nextInt();
			 System.out.println("Enter the fnum : ");
		 int snum=sc.nextInt(); 
		 System.out.println("");
		 System.out.println("Answer : "+user.mul(fnum, snum));
		 System.out.println("");
		 
	 } else if (choice==4){
		 System.out.println("Enter the fnum : ");
		 int fnum=sc.nextInt();
			 System.out.println("Enter the fnum : ");
		 int snum=sc.nextInt(); 
		 System.out.println("");
		 System.out.println("Answer : "+user.div(fnum, snum));
		 System.out.println("");
		 
	 }
	 else if (choice==5){
		  istrue=false;
		 System.out.println("you are exited");
		 
		
	 }else {
		 System.out.println("");
		 System.out.println("Enter the correct choice");
		 System.out.println("");
	 }}
}
}
