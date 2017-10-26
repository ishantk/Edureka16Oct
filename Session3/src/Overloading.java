
public class Overloading {

	void addNumbers(int a, int b){
		int c = a+b;
		System.out.println("Sum is: "+c);
	}
	
	void addNumbers(int a, int b, int c){
		int d = a+b+c;
		System.out.println("Sum is: "+d);
	}
	
	void fun(){
		
	}
	
	void fun(int a){
		
	}
	
	void fun(int a, int b){
		
	}
	
	void fun(float a){
		
	}
	
	void fun(float a, float b){
		
	}
	
	void fun(int a, float b){
		
	}
	
	void fun(float a, int b){
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		// Binding - Linking the function call to its definition
		// Overloading - Keep the same function name with different inputs with different definition
		// Rules to Overload
			// 1. Function Name should be Same
			// 2. Inputs should be Unique(Different) -> Signature should be Unique
				//2.1 Number of Inputs
				//2.2 Type of inputs
				//2.3 Sequence of Inputs
			// 3. Return Type has no significance 

		Overloading oRef = new Overloading();
		oRef.addNumbers(10, 20);
		oRef.addNumbers(10, 20, 30);
		
		oRef.fun();
		oRef.fun(10);
		oRef.fun(20,30);
		oRef.fun(2.2f);
		oRef.fun(2.2f,3.3f);
		oRef.fun(2,3.3f);
		oRef.fun(2.2f,3);
		
	}

}
