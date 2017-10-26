
public class DataTypes {

	// Whenever we execute our program, this guy is executed.
	
						    // Array of Strings which is passed on Command Line
							// Command Line Parameters
	public static void main(String[] args) {
		
		// API (Library) Its definition is available in JDK
		System.out.println("Hello World");

		
		// Usage of Data types and Data Operations
		
		//DataType ContainerName(Variable)  =  Literal
		byte age = 8;
		// 0 0 0 0 1 0 0 0
		
		byte number = 10;
		
		byte var = 8;
		// var is 8 bits, 8 is 32 bits
		
		short s = 100;
		// s is 16 bits, 100 is 32 bits
		
		int i = 100;
		// i is 32 bits, and 100 is also 32 bits
		
		long l = 100;
		// l is 64 bits, 100 is 32 bits
		long l1 = 12000000000l;
		// l1 is 64 bits and 12000000000l is 64 bits
		
		byte myAge = age;
		
		byte yourAge = (byte)s; // DownCasting or Casting
		
		//float f = 2.2;
		// f is 32 bits, 2.2 is 64 bit literal
		
		float f = 2.2f;
		// now f is 32bits and 2.2f is alos 32 bits
		
		double d = 2.2;
		// d is 64bits and 2.2 is also 64 bits
		
		float g = (float)d; // Downcasting
		
		// characters in java are stores as unicodes
		char ch = '\u20b9';
		System.out.println("ch is: "+ch);
		
		int num1 = 10;
		char ch1 = '\u20b9';
		
		System.out.println("Number1 value is: "+num1);
		System.out.println("Character1 value is: "+ch1);
		
		System.out.println("This "+"is "+"a number: "+num1);
		
		int side = 10;
		int area = side*side;
		System.out.println("Area is: "+area);
		
		int n = 10;
		int r = n%3;
		
		r++;
		++r;
		
		System.out.println("r is: "+r);
		
	}

}
