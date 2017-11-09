package co.edureka;

class Application{
	
	private static Application app = new Application();
	
	private Application() {
		System.out.println("Application Object Created..");
	}
	
	public static Application getApplication(){
		return app;
	}

}

public class Singleton {

	public static void main(String[] args) {
		
		/*
		//1st Object
		Application apRef1 = new Application();
		System.out.println("App1: "+apRef1);
		
		//2nd Object
		Application apRef2 = new Application();
		System.out.println("App2: "+apRef2);	
		
		*/
		
		// Since Constructor is marked as private, we cannot create Objects
		
		//1st Object
		Application apRef1 = Application.getApplication(); 
		System.out.println("App1: "+apRef1);
		
		//2nd Object
		Application apRef2 = Application.getApplication();
		System.out.println("App2: "+apRef2);	
		
			
	}

}
