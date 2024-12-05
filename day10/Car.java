package day10;

public class Car {
String name;
int year;
Car(){
   this.name="unknown";
   this.year=2000;
}
 Car(String name){
	 this.name=name;
	   this.year=2000;
	 
 }
 Car(String name,int year){
	 this.name=name;
	   this.year=year;
 }
 void car() {
	 System.out.println(year);
	 System.out.println(name);
 }
}
