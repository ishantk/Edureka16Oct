package co.edureka;

/*class Task{
	void performTask(){
		for(int i=1;i<=10;i++){						
			System.out.println("**Task** "+i);
		}
	}
}*/

// java.lang | Need not to Import

class A{
	
}

class MyTask extends Thread{ // Task IS-A Thread
	
	MyTask(String name){
		super(name);
	}
	
	public void run(){
		for(int i=1;i<=10;i++){					
			
			try {
				Thread.sleep(1000); // 1000 milli seconds -> 1sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println("**MyTask** "+i);
			
		}
	}
}

class YourTask implements Runnable { // Task IS-A Thread
	public void run(){
		for(int i=1;i<=10;i++){	
			try {
				Thread.sleep(1000); // 1000 milli seconds -> 1sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println("##YourTask## "+i);
		}
	}
}

public class Threads {

	// main method represents main thread
	public static void main(String[] args) {
		
		System.out.println("Main Started..");		//J1
		
		//Task tRef = new Task();
		//tRef.performTask(); 						//J2
		
		MyTask tRef = new MyTask("John"); // Setting Name in Constructor
		
		Runnable r = new YourTask(); // polymorphic Statement
		Thread th = new Thread(r);
		
		//tRef.setName("John");
		th.setName("Jennie");
		Thread.currentThread().setName("Jack");
		
		tRef.setPriority(Thread.MAX_PRIORITY); // 10
		th.setPriority(Thread.NORM_PRIORITY); // 5
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 1
		
		tRef.start(); // start internally calls the run method
		
		try {
			tRef.join(); // join method call is made immediately after the start method call
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		th.start();
		
		th.yield();
		
		for(int i=1;i<=10;i++){						//J3
			
			try {
				Thread.sleep(1000); // 1000 milli seconds -> 1sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println("==Main Thread== "+i);
		}
		
		System.out.println("MyTask Name is: "+tRef.getName());
		System.out.println("YourTask Name is: "+th.getName());
		System.out.println("Main Thread Name is: "+Thread.currentThread().getName());

		System.out.println("MyTask Priority is: "+tRef.getPriority());
		System.out.println("YourTask Priority is: "+th.getPriority());
		System.out.println("Main Thread Priority is: "+Thread.currentThread().getPriority());
		
		System.out.println("Main Finished..");		//J4
		
		//Thread.State.NEW
		
		/*if(tRef.getState() == Thread.State.TERMINATED){
			
		}*/
		
	}

}
