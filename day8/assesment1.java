package day8;
import java .util.Scanner;
public class assesment1 {
	
             	//vote assesment
//	           ------------------
	//------------------------------------------------------------------------------------------------------
//	void vote (int age){
//		if(age>=18) {
//			System.out.println("you are eligible to vote");
//		}else {
//			System.out.println("yore are not eligible to vote");
//		}
//	}
	//public static void main(String[] args) {
//		System.out.println("Enter the age : ");
//Scanner sc = new Scanner(System.in);
//	int age=sc.nextInt();
//	assesment1 name =new assesment1();
//	
//	name.vote(age);
	// ---------------------------------------------------------------------------------------------------

	                   //	print 1 to 100 every mul shobld be "lucky"
                   //   ---------------------------------------------------

//------------------------------------------------------------------------------------------------------------
 
//	public static void main(String[] args) {
//		for (int i = 1;i<=100;i++) {
//			if(i%4==0) {
//				System.out.println("Lucky"); 
//				
//			}else {
//				System.out.println(i);
//			}
//			
//		}
//	----------------------------------------------------------------------------------------------------------------
		
                                   //	skip odd numbers 1 to 70 
//	                             ---------------------------------
		
//		----------------------------------------------------------------------------------------------------------------
//		public static void main(String[] args) {
//			for (int i = 1;i<=70;i++) {
//				if(i%2==0) {
//					System.out.println(i); 
//					
//				}else {
//					continue;
//				}
//				
//			}

//--------------------------------------------------------------------------------------------------------------------------
	                       //           check number is even or odd
	                             //   --------------------------------
	//-------------------------------------------------------------------------------------------------------------------------
//	boolean istrue = true;
//	public static void main(String[] args) {
//		assesment1 dc =new assesment1();
////		boolean istrue = true;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		while(dc.istrue) {
//			System.out.println("");
//			System.out.println("Enter the number : ");
//		int num = sc.nextInt();
//		if (num%2==0) {
//			System.out.println(num +" = is even  ");
//			
//		}else {
//			System.out.println(num +" = is odd  ");
//		}
//		}
// -------------------------------------------------------------------------------
//                          string into captial to small
// -------------------------------------------------------------------------------
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the name UC: ");
//		String name=sc.nextLine();
//        System.out.println(name.toUpperCase());	
//        System.out.println(" ");
//        System.out.println("Enter the name LC: ");
//        String name1=sc.nextLine();
//        System.out.println(name1.toLowerCase());	
 //    ------------------------------------------------------------------------------       
	           // check mark is pass or fail
//	-----------------------------------------------------------------------------------
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the mark : ");
	int mark=sc.nextInt();
	if(mark>=35) {
		System.out.println("Pass");
		if (mark>=90){
		System.out.println("A grade");
		
		
	}else if(mark>=70) {
		System.out.println("B grade");
	}
	
	
	}else {
		System.out.println("Fail");
	
}
//-----------------------------------------------------------------------------------
                             //find total and average
//-----------------------------------------------------------------------------------
//public static void main(String[] args) {
// Scanner sc =new Scanner(System.in);
// 
// System.out.println("Enter the english mark : ");
//int english=sc.nextInt();
//System.out.println();
//System.out.println("Enter the tamil mark : ");
//int tamil=sc.nextInt();
//System.out.println();
//System.out.println("Enter the science mark : ");
//int science=sc.nextInt();
//System.out.println();
//System.out.println("Enter the social mark : ");
//int social=sc.nextInt();
//System.out.println();
//System.out.println("Enter the maths mark : ");
//int maths=sc.nextInt();
//System.out.println();
//int total=(maths+english+tamil+social+science);
// System.out.println("total : "+total );
// float avg =total/5;
// System.out.println("Average : "+avg );
//}
//-----------------------------------------------------------------------------------
                                  //find a leap year
//-----------------------------------------------------------------------------------
	// void leap(int year) {
	// 			if(year%4==0) {
	// 				System.out.println("leap year");
	// 			}
	// 			else {
	// 				System.out.println("not a leap year");
	// 			}
	// 		}
	// 			public static void main(String[] args) {
	// 				Scanner sc =new Scanner(System.in);
	// 				day ans =new day();
	// 				System.out.println("Enter the year : ");
	// 				int year=sc.nextInt();
	// 				ans.leap(year);
				
}
}





