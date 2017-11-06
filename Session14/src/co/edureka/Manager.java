package co.edureka;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MANAGER")
public class Manager {

	// Attributes
	@Id @GeneratedValue
	@Column(name = "MID")
	Integer mid;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "EMAIL")
	String email;
	
	public Manager() {
	
	}

	public Manager(Integer mid, String name, String email) {
		this.mid = mid;
		this.name = name;
		this.email = email;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
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

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", email=" + email + "]";
	}
	
}
