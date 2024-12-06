package day11;

public class Employee {
private	String name ;
private int id ;
private	int age;
private String dept;
	Employee(){
		
		
	}
	Employee(String name,int id,int age,String dept){
		this.name=name;
		this.id=id;
		this.age=age;
		this.dept=dept;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	public void setName(String name) {
		this.name=name;
	}
public void setId(int id) {
	this.id=id;

	}
public void setAge(int age) {
	this.age=age;
}
public void setDept(String dept) {
	this.dept=dept;
}
public String toString() {
	return  "Employee name : "+name+ "\n Employee id : " + id+ "\n Employee age : "+age+" \nEmployee dept : "+dept;
	
}

}
