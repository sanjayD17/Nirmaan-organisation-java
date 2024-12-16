package Day17;

public class Dog implements IAnimal{
	
	@Override
	public void speak(){
		System.out.println("The dog says : Woof Woof ");
	}
	
	public void move() {
		System.out.println("The dog runs on four leg ");
		
	}
	
	
public static void main(String[] args) {
	
}
}