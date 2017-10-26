/*class Shape{
	
	Shape(){
		System.out.println("Shape Object Constructed..");
	}
	
	void draw(){
		System.out.println("Drawing a Shape");
	}
}*/

// Refine RunTimePolymorphism

// Its a Class for which you cannot create Objects, but RTE can create Objects
/*abstract class Shape{
	
	Shape(){
		System.out.println("Shape Object Constructed..");
	}
	
	// Created only in the abstract class and will have no defintion
	// This is a rule or a protocol by parent, which children must defines
	abstract void draw();
	
	// n number of abstract methods defined in abstract class has to be defined by children. They must be overrided by children.
	
	void fun(){
		System.out.println("This is fun");
	}
}*/

//Most Refine Way of doing RunTimePolymorphism

interface Shape{
	
	// Interfaces cannot have Constructors.
	// Neither You Nor RTE can Create Object of interface.
	
	/*Shape(){ -> error
		System.out.println("Shape Object Constructed..");
	}*/
	
	// This is a rule or a protocol by interface, which object implementing it must define
    void draw(); // public abstract void draw();
	
	
	// Cannot have methods with definitions
	/*void fun(){ -> error
		System.out.println("This is fun");
	}*/
}

class Rectangle implements Shape{//extends Shape{
	
	Rectangle(){
		System.out.println("Rectangle Object Constructed..");
	}
	
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}

class Circle implements Shape{//extends Shape{
	
	Circle(){
		System.out.println("Circle Object Constructed..");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Triangle implements Shape{//extends Shape{
	
	Triangle(){
		System.out.println("Triangle Object Constructed..");
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		/*Shape s;
		s = new Shape();
		
		s.draw();*/
		
		/*Rectangle r;
		r = new Rectangle();
		
		r.draw();*/
		
		// F : John Watson | C : Jennie Watson | Jennie Watson IS A John Watson
		// Rectangle IS A Shape
		
		// Reference Variable of Parent can store the reference of Child Object.
		
		Shape s; // s is a reference variable
		
		// Polymorphic Statement
		s = new Rectangle(); // s is pointing to the object of Rectangle
		s.draw(); // execute the version of child
		
		s = new Circle();
		s.draw();
		
		s = new Triangle();
		s.draw();
		
		// This makes no sense as Object of Rectangle, Triangle or Circle are the real Objects
		//s = new Shape(); // error
		//s.draw();


	}

}
