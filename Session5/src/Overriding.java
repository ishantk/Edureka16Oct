class Father{
	
	// Non Static | Property of Father Object
	void purchaseBike(){
		System.out.println("Lets Purchase Bajaj Pulsar");
	}
	
	// Static | Property of Father Class
	static void purchaseCar(){
		System.out.println("Lets Purchase Maruti Swift");
	}
	
}

class Son extends Father{
	
	// In the Son Object we are creating one more method with same name as that of Parent's Method
	// Overriding | Re-Define the same method of Parent in Child with a different definition but same signature.
	public void purchaseBike(){
		System.out.println("Lets Purchase Royal Enfield");
	}
	
	// In the Son Class we are creating one more method with same name as that of Parent's Method
	// Hiding | Re-Define the same method of Parent Class in Child Class with a different definition but same signature.
	static void purchaseCar(){
		System.out.println("Lets Purchase Honda City");
	}
	
}


public class Overriding {

	public static void main(String[] args) {
		
//		Father fRef = new Father();
//		fRef.purchaseBike();
		
		Son sRef = new Son(); //Now, In the Son Object, we have 2 methods -> purchaseBike() | purchaseBike()
		sRef.purchaseBike();
		
		Son.purchaseCar();
	
	}

}
