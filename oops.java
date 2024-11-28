package day5oops;

public class oops {
	String name="";
	int age ;
	int rollnum;
	String date;
	public static void main(String args[]) {
		
	oops stud = new oops();
	stud.name ="baki";
	stud.age =18;
	stud.rollnum =1234;
	stud.date ="12/11/2001";
	System.out.println("name : "+stud.name+" "+"age : "+stud.age+" "+"rollnum : "+stud.rollnum+" "+"date : "+stud.date);
	oops stud2 = new oops();
	stud2.name ="hanma";
	stud2.age =24;
	stud2.rollnum =12345;
	stud2.date ="22/10/2001";
	System.out.println("name : "+stud2.name+" "+"age : "+stud2.age+" "+"rollnum : "+stud2.rollnum+" "+"date : "+stud2.date);

	
		
		
	}

}
