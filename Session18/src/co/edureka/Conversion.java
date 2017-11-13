package co.edureka;

import java.util.Date;

// Web Service
public class Conversion {

	// Web Methods | 1. Should be public. 2. Should return something, which is response. 
	public int mtrsToCms(int mtrs){
		int cms = mtrs*100;
		return cms;
	}
	
	public int feetToInches(int feet){
		int inches = feet*12;
		return inches;
	}
	
	public float inrToDollar(int inr){
		float dollar = inr/65.0f;
		return dollar;
	}
	
	public String registerStudent(int roll, String name, String email){
		String str = name+" registered at "+new Date();
		return str;
	}
}
