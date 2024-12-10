package Day14;



public class Employee {
	String name;
	int id;
	String depart;
	long phno;
	
	public Employee() {
		
	}
	
	public Employee(String name,int id,String depart,long phno) {
		this.name = name;
		this.id = id;
		this.depart = depart;
		this.phno = phno;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", depart=" + depart + ", phno=" + phno + "]";
	}
	
	

}
