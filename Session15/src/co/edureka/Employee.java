package co.edureka;

// Java Object | POJO | Bean | Model
public class Employee {

	// Attributes
	int eid;
	String name;
	int salary;
	String email;
	String address;
	
	public Employee() {
		System.out.println("--Employee Object Constructed--");
	}

	public Employee(int eid, String name, int salary, String email, String address) {
		System.out.println("--Employee Object Constructed--");
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", email=" + email + ", address="
				+ address + "]\n"+super.toString();
	}
	
	public void myInit(){ // user defined method
		System.out.println("Employee Init Executed...");
	}
	
	public void myDestroy(){ // user defined method
		System.out.println("Employee Destroy Executed...");
	}
	
}
