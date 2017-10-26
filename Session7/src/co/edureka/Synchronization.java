package co.edureka;

class Table{
	
	// MUTEX | Lock | monitor
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
}

class MyThread extends Thread{
	
	Table t;
	
	MyThread(Table u){
		t = u;
	}
	
	public void run(){
		
		synchronized (t) {
			t.printTable(5);
		}
	}
	
}

class YourThread extends Thread{
	
	Table t;
	
	YourThread(Table u){
		t = u;
	}
	
	public void run(){
		synchronized (t) {
			t.printTable(7);
		}
	}
	
}

public class Synchronization {

	public static void main(String[] args) {

		System.out.println("Main Thread Started");
		
		Table tRef = new Table();
		//tRef.printTable(5);
		
		MyThread mt = new MyThread(tRef);
		YourThread yt = new YourThread(tRef);
		
		mt.start();
		yt.start();
		
		System.out.println("Main Thread Finished");

	}

}
