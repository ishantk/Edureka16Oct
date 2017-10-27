class Outer{
	void show(){
		System.out.println("Show of Outer..");
	}
	
	class Inner{
		void show(){
			System.out.println("Show of Inner..");
		}
	}
}

// IS-A | Inheritance
// HAS-A| class A{  } class B{ int i; A a;}
// Containment | One Object Contains Another Object

class Manager{
	
	// Attributes
	int mid;
	String name;
	
	class Address{
		
	}
	
}

class AirConditioner{
	
	class Filter{
		
	}
	
}

class A{
	
	private class B{
		
	}
	
	interface I{
		
	}
	
	void fun(){
		// Local Class
		class C{
			
		}
		
		// Local Interfaces not possible
		//interface K{ | error
			
		//}
	}
	
	static void show(){
		// Local class in static context
		class D{
			
		}
	}
	
	static class E{
		
	}
	
	static interface J{
		
	}
	
}

/*private class B{ error
	
}*/

public class Nested {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner(); // Create an Object of Inner, within the Object to which oRef points
		iRef.show();

	}

}
