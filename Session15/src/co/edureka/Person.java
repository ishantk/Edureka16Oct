package co.edureka;

import java.util.List;

public class Person {
	
	// Attributes
	String name;
	String email;
	int age;
	
	Address address; // HAS-A Relation
	
	
	List<String> certificates; // HAS-A Relation | Collection
	
	List<Employee> empList;
	
	public Person() {
	
	}

	public Person(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public Person(Address address) {
		this.address = address;
	}
	
	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", address=" + address + "]";
	}

}
