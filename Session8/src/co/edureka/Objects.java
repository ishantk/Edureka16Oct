package co.edureka;

class Employee{ //extends Object{
	
	public String toString() {
		return "This is Awesome - "+super.toString();
	}
	
}

class NewInt{
	
	int i;
	
	NewInt(int j){
		i = j;
	}
	
	@Override
	public String toString() {
		return String.valueOf(i);
	}
}

class Manager extends Employee{
	
}

public class Objects {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println("emp is: "+emp);				// Implicit
		System.out.println("emp is: "+emp.toString());  // Explicit
		
		System.out.println("emp hashCode is: "+emp.hashCode());
		
		System.out.println("emp class is: "+emp.getClass());
		System.out.println("emp class is: "+emp.getClass().getName());
		System.out.println("emp class is: "+emp.getClass().getSimpleName());
		
		/*String str = new String("Hello");
		Integer iRef = new Integer(10);
		
		NewInt iRef2 = new NewInt(10);
		
		System.out.println("str is: "+str);
		System.out.println("iRef is: "+iRef);
		System.out.println("iRef2 is: "+iRef2);*/
		
		
		Object o = new Employee();
		o = new String("John");
		o = new Integer(10);
		o = new Thread();
		
		
	}

}
