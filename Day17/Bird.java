package Day17;

public class Bird implements IAnimal{
	@Override
	public void speak(){
		System.out.println("The brid says : Chrip Chrip ");
	}
	
	public void move() {
		System.out.println("The Brid flies in the sky ");
		
	}
	
	
public static void main(String[] args) {
Bird b = new Bird();
Dog d = new Dog();

d.speak();
d.move();
b.speak();
	b.move();
	System.out.println(IAnimal.isMammal("Dog"));
	System.out.println(IAnimal.Catergory);
}
}
