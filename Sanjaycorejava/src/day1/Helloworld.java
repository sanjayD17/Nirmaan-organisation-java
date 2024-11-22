package day1;

public class Helloworld {
	public static void main(String args[]) {
		int firstname =22;
		int secondname =17;
		int thridname = 44;
		int fourthname = 24;
		int addtion = firstname+secondname;
		int subtraction = firstname-secondname;
		int multiplication = firstname*secondname;
		int division = firstname/secondname;
		int modulus = firstname%secondname;
		int val = 10;
		
		System.out.println(" operators ");
   System.out.println("Addtion :" +addtion);
   System.out.println("subtration  : " +subtraction);
   System.out.println("Multiplication : " +multiplication);
   System.out.println("Dicvision : " +division);
   System.out.println("Modulus : " +modulus);
   System.out.println( "relational operation") ;
   System.out.println("Greater than : " +(firstname>secondname) );
   System.out.println("Lesser than : " +(firstname<secondname) );
   System.out.println("Greater than or equal to : " +(firstname>=secondname) );
   System.out.println("Lesser than or equal to : " +(firstname<=secondname) );
   System.out.println("Equal : " +(firstname==secondname) );
   System.out.println("Not equal to : " +(firstname!=secondname) );
   System.out.println( "Logical opertion");
   System.out.println( "And : " +(firstname>thridname&&fourthname<secondname) );
   System.out.println( "And : " +(firstname>thridname&&fourthname<secondname) );
   System.out.println( "Assignment operation") ;
   System.out.println("Initial value : " +val );
   System.out.println("After +=: " +(val+=thridname ));
   System.out.println("After -=: " +(val-= firstname));  
   System.out.println("After *=: " +(val*=5 ));
   System.out.println("After /=: " +(val/=5 ));
   System.out.println("After %=: " +(val%=5 ));
   
   
   
   

}
}