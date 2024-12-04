package Day9;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		boolean isTrue=true;
		Scanner lol = new Scanner(System.in);
		Calci sc = new Calci ();
		while (isTrue){
			
			System.out.println("Enter the option");
			System.out.println("0 for add");
			System.out.println("1 for sub");
			System.out.println("2 for multiplication");
			System.out.println("3 for division");
			System.out.println("4 for modulus");
			System.out.println("7 for exit");
			
			System.out.println("Choose the option :");
			int on =lol.nextInt();
			System.out.println();

		switch (on) {
		case 0: {
			System.out.println("Enter the no : ");
			int fn=lol.nextInt();
				System.out.println("Enter the second no :");

				int sn=lol.nextInt();
			
			System.out.println("add :"+sc.add(fn,sn));
			System.out.println();
			break;
		}
		case 1: {
			System.out.println("Enter the no : ");
			int fn=lol.nextInt();
				System.out.println("Enter the second no :");

				int sn=lol.nextInt();
			int tn=fn-sn;
			System.out.println("subtraction :"+sc.sub(fn,sn));
			break;
		}
		case 2: {
			System.out.println("Enter the no : ");
			int fn=lol.nextInt();
				System.out.println("Enter the second no :");

				int sn=lol.nextInt();
			int tn=fn*sn;
			System.out.println("multiplicaton :"+sc.mul(fn,sn));
			break;
		}
		case 3: {
			System.out.println("Enter the no : ");
			int fn=lol.nextInt();
				System.out.println("Enter the second no :");

				int sn=lol.nextInt();
			int tn=fn/sn;
			System.out.println("divisin :"+sc.div(fn,sn));
			break;
		}
		case 4: {
			System.out.println("Enter the no : ");
			int fn=lol.nextInt();
				System.out.println("Enter the second no :");

				int sn=lol.nextInt();
			int tn=fn%sn;
			System.out.println("modulus :"+sc.mod(fn,sn));
			break;
		}
		case 7: {
			isTrue = false;
			System.out.println("Thank you for using calculater ");
			break;
			
		}
		default: {
			System.out.println("Enter the correct option");
		
		
		}


		
		}
		}}}
	


