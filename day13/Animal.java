package day13;
class animals{
void sound() {
	System.out.println("Animal makes sound");
}


}
class dog extends animals{
@Override
void sound(){
	System.out.println("dog barks");}
String eat() {
	return "dog eat meats";
	
	}
	 
}

class cat extends dog {
  void color() {
	  System.out.println("white");
  }
}
public class Animal {
	public static void main(String[] args) {
		dog sc=new dog();
		cat on =new cat();
		sc.sound();
		on.color();
	}
	
}
