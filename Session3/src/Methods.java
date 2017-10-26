
public class Methods {

	/*
	 Ack nameOfMethod(){ 
		// Instructions
	}
	
	*/
	
	// Non Static Method
	void calculateArea1(int length, int breadth){
		int area = length * breadth;
		System.out.println("Area is: "+area);
	}
	
	// Static Method
	static void calculateArea2(int length, int breadth){
		int area = length * breadth;
		System.out.println("Area is: "+area);
	}
	
	// Non Static Method
	int calculateArea3(int side){
		int area = side*side;
		return area;
	}
	
	// Static Method
	static int calculateArea4(int side){
		int area = side*side;
		return area;
	}
	
	
	// main is also a method which is executed 1st when you run the program
	public static void main(String[] args) {
		
		// Execute Static Methods
		calculateArea2(10, 20); // Execution of Method | Calling the Method
		calculateArea2(11, 21);
		
		Methods.calculateArea2(12, 22);
		
		int a = calculateArea4(7);
		int b = calculateArea4(9);
		int c = Methods.calculateArea4(11);

		System.out.println("Area is: "+a);
		System.out.println("Area is: "+b);
		System.out.println("Area is: "+c);
		
		// Execute Non Static Methods
		
		//calculateArea1(10, 20); error
		//Methods.calculateArea1(10, 20); error
		
		System.out.println("==============");
		
		// We shall create Object of Class and Execute the Methods
		Methods mRef = new Methods(); // Object Construction Statement
		
		mRef.calculateArea1(10, 20);
		mRef.calculateArea1(11, 21);
		
		int d = mRef.calculateArea3(7);
		int e = mRef.calculateArea3(19);
		System.out.println("Area is: "+d);
		System.out.println("Area is: "+e);
		
	}

}
