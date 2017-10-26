class Batch{
	
	// Attributes
	int bid;
	String name;
	int num;
	
	// Constructor | executed when you create the object and is used to provide some initial values to attributes
	/*
	Batch(){
		bid = 0;
		name = null;
		num = 0;
	}
	*/
	
	// Default Constructor
	Batch(){
		bid = -1;
		name = "NA";
		num = -1;
	}
	
	// Paramemterized Constructor
	Batch(int id, String nm, int n){
		bid = id;
		name = nm;
		num = n;
	}
	
}


public class Constructors {

	public static void main(String[] args) {
		
		Batch b1 = new Batch(); // Java
		b1.bid = 1;
		b1.name = "Java";
		b1.num = 12;
		
		System.out.println("Batch 1 Details: ");
		System.out.println("Batch ID "+b1.bid+" is "+b1.name+" batch with "+b1.num+" students");
		
		Batch b2 = new Batch();
		
		// We are not writing any data in Object2
		// We are directly reading without writing
		System.out.println("Batch 2 Details: ");
		System.out.println("Batch ID "+b2.bid+" is "+b2.name+" batch with "+b2.num+" students");
		
		Batch b3 = new Batch(105,"Android",20);
		System.out.println("Batch 3 Details: ");
		System.out.println("Batch ID "+b3.bid+" is "+b3.name+" batch with "+b3.num+" students");
		
	}

}
