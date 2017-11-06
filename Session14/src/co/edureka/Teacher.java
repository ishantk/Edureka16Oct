package co.edureka;

import java.util.List;

public class Teacher {

	// Attributes
	int tid;
	String name;
	
	//1 - *
	List<Certificate> certiList; // HAS-A relation
	
	//Methods
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Certificate> getCertiList() {
		return certiList;
	}
	public void setCertiList(List<Certificate> certiList) {
		this.certiList = certiList;
	}
	
}
