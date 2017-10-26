package co.edureka;

class MyInt{
	
	int i;
	
	public MyInt(int j) {
		i = j;
	}
	
	int getNum(){
		return i;
	}
}

public class Lang {

	public static void main(String[] args) {
		
		double result = Math.sqrt(16);
		System.out.println(Math.log10(10));
		System.out.println("Result is: "+result);
		
		// Wrapper Classes
		
		// Primitive Type
		int i = 10;
		
		// How can we represent primitives as references ? -> Using Wrapper Classes
		
		// Boxing the i 
		/*MyInt mRef = new MyInt(i); // Stored primitive into object
		
		int k = mRef.getNum();
		System.out.println("mRef is: "+mRef);
		System.out.println("k is: "+k);*/
		
		/*
		 int Integer
		 float Float
		 long Long
		 char Character
		*/
		
		// Boxing | Wrapping of primitive into Object
		Integer iRef = new Integer(i);
		// UnBoxing
		int k = iRef.intValue(); 
		
		
		char ch = 'A';
		Character cRef = new Character(ch); // Boxing
		char c = cRef.charValue(); 	        // UnBoxing
		
		
		int l = 100;
		Integer lRef = l; // AutoBoxing   | (Implicit Statement) Integer lRef = new Integer(l);
		int m = lRef;     // AutoUnBoxing | int m = lRef.intValue();
		
		// In the world of OOPS, even primitives can be represented as objects. | Pass by Reference
		
		
		String num = "10";
		int iNum = Integer.parseInt(num);
		System.out.println("iNum is: "+iNum);
		
		
		
	}

}
