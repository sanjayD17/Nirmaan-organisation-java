package day6n;
import java.util.Scanner;
public class nirmaanorg {
	String name = "";
	int id ;
    float salary ;
    String department = "";
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	nirmaanorg emp = new nirmaanorg();
    	emp.name = "baki";
    	emp.id = 123;
    	emp.salary=700000.2f;
    	emp.department="iT";
    	System.out.println(emp.name + emp.id + emp.salary + emp.department);
    	nirmaanorg emp2 = new nirmaanorg();
    	emp2.name = sc.next();
    	emp2.id = sc.nextInt();
    	emp2.salary=sc.nextFloat();
    	emp2.department=sc.next();
    	System.out.println(emp2.name + emp2.id + emp2.salary + emp2.department);
    	
		
	}
}
