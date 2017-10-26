/*class A{
	
}

class B{
	
}

class C extends A,B{ // Multiple Inheritance is an Error
	
}
// Inheritance means Object to Object or Class to Class
*/

interface A{
	void show();
}

interface B{
	void fun();
	void show();
}

// Inheritance below is not Object to Object, Not Class to Class. But it is Interface to Interface.
interface I extends A,B{ // Multiple Inheritance is Supported in Java, when it comes to interfaces.
	
}

class C implements I{//A,B{ // Multiple Implementation is Possible
	public void show(){
		System.out.println("This is show");
	}
	
	public void fun(){
		System.out.println("This is fun");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		
		/*A a = new C();
		B b = new C();
		
		a.show();
		//a.fun(); err
		
		b.fun();
		b.show();*/
		
		I i = new C(); // Polymorphic Statement
		i.fun();
		i.show();

	}

}
