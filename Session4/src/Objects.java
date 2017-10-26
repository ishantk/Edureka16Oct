// Textual Representation of an Object
class Student{
	
	// Attributes | State
	// Attributes below are the property of Object and not of class
	private int regId;
	private String name;
	String email;
	String phone;
	byte age;
	char gender;
	
	
	// Methods | Behavior
	// Methods below are the property of Object and not of class
	void setRegId(int i){
		regId = i;
	}
	
	void setName(String n){
		name = n;
	}
	
	int getRegId(){
		return regId;
	}
	
	String getName(){
		return name;
	}
}


public class Objects {

	public static void main(String[] args) {
		
		// Object Creation Statement
		Student sRef1 = new Student();  // Multi Value Container | Hetrogeneous
		Student sRef2 = new Student();	// Multi Value Container | Hetrogeneous
		
		int i = 10;
		int[] arr = {10,20,30,40,50};   // Multi Value Container | Homogeneous
		
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		
		System.out.println("sRef1 is: "+sRef1);
		System.out.println("sRef2 is: "+sRef2);
		
		// Write the data in Object
		//sRef1.regId = 101;
		//sRef1.name = "Fionna";
		sRef1.setRegId(101);
		sRef1.setName("Fionna");
		sRef1.email = "fionna@example.com";
		
		//sRef2.regId = 102;
		//sRef2.name = "Frankie";
		sRef2.setRegId(102);
		sRef2.setName("Frankie");
		sRef2.email = "frankie@example.com";
		
		// Read the data from Object
		//System.out.println(sRef1.name+" is having a registration id: "+sRef1.regId);
		//System.out.println(sRef2.name+" is having a registration id: "+sRef2.regId);
		System.out.println(sRef1.getName()+" is having a registration id: "+sRef1.getRegId());
		System.out.println(sRef2.getName()+" is having a registration id: "+sRef2.getRegId());
		
		Student sRef3 = sRef1; // Reference Copy
		
		/*sRef3.name = "John Watson";
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(sRef3.name+" is having a registration id: "+sRef3.regId);
		System.out.println(sRef1.name+" is having a registration id: "+sRef1.regId);*/
		
		
	}

}
