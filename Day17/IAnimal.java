package Day17;

public interface IAnimal {
String Catergory = "Living Being" ;


static boolean isMammal(String animalName) {
	return (animalName=="Dog"||animalName=="Bird" || animalName=="Human");
}
default void speak() {
	System.out.println("Animal is making a sound ");
}
void move();

}
