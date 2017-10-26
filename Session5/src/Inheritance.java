// Textual Description of an Object
class Animal{
	
	// Attributes
	int legs;
	String color;
	
	private int n; // private will not be inherited
	
	static int p; // static, part of class
	
	// Methods
	Animal(){ // constructors will not be inherited
		System.out.println("Animal Object Constructed...");
	}
	
	void showAnimalDetails(){
		System.out.println("Animal with "+color+" color has "+legs+" legs");
	}
	
	static void show(){ // static, part of class
		System.out.println("Showing "+p);
	}
}

class Dog extends Animal{
	
	// Attribute
	String type;
	static int q;
	
	// Methods
	Dog(){
		System.out.println("Dog Object Constructed...");
	}
	
	void showDogDetails(){
		System.out.println("Dog of type "+type+" with "+color+" color has "+legs+" legs");
	}
	
	static void fun(){
		System.out.println("Fun says "+q);
	}
	
}


public class Inheritance {

	public static void main(String[] args) {
		
		Animal aRef = new Animal();
		aRef.legs = 4;
		aRef.color = "Black";
		
		aRef.showAnimalDetails();
		
		// JVM i.e. RTE will create Parent Object first and then the Child Object is Constructed
		Dog dRef = new Dog();
	}

}
