package day11;

public class Nirmaan {
	public static void main(String[] args) {
		//constructor
		Employee emp=new Employee("baki",1234,23,"software engineer");
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getAge());
		System.out.println(emp.getDept());
		// setter	
		Employee emp1 = new Employee();
		emp1.setName("asura");
		emp1.setId(2345);
		emp1.setAge(24);
		emp1.setDept("testing");
		System.out.println(emp1.getName());
		System.out.println(emp1.getId());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getDept());
		
System.out.println(emp.toString());
System.out.println(emp1);
		
	}
	
	
	

}
