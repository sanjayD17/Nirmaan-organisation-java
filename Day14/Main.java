package Day14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Employee emp=new Employee("lucky",1234,"software engineer",1234567854l);
	
		
		
		Scanner sc =new Scanner(System.in);
		
		int choice;
		boolean istrue=true;
		
		while (istrue) {
			System.out.println("Enter the requried option : ");
			System.out.println(" 1 -> for Add/update employee details : ");
			System.out.println(" 2 -> for constructor method : ");
			System.out.println(" 3 -> for display the employee details : ");
			System.out.println(" 0 -> for exit the program : ");
			
			System.out.println("");
			System.out.println("choose the option : ");
			choice=sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter the name : ");
				String name=sc.nextLine();
				emp.setName(name);
				System.out.println("Enter the id : ");
				int id=sc.nextInt();
				emp.setId(id);
				System.out.println("Enter the department : ");
				String depart=sc.nextLine();
				sc.nextLine();
				emp.setDepart(depart);
				System.out.println("Enter the phone no : ");
				long phno=sc.nextLong();
				emp.setPhno(phno);
				break;
				
				
				
			
			}
			case 2:{
				System.out.println("Enter the name : ");
				String name=sc.nextLine();
				System.out.println("Enter the id : ");
				int id=sc.nextInt();
				System.out.println("Enter the department : ");
				String depart=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the phone no : ");
				long phno=sc.nextLong();
				 emp =new Employee(name,id,depart,phno);
				
				break;
				
			}
			case 3:{
				System.out.println("");
				System.out.println(emp);
				System.out.println("");
				break;
			}
			case 0:{
				 istrue=false;
				 System.out.println(" you are exited \n \n thank you " );
				 break;
			}
			default:{
				System.out.println(" choose the correct option ");
			}
				
				
			}
			
		}
				
	}

}

