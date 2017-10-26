package co.edureka;

class Printer{
	//synchronized static void printDocument(){
	static void printDocument(){
		
	}
}

class T1 extends Thread{
	
	public void run(){
		
		synchronized (Printer.class) {
			Printer.printDocument();
		}
		
		
	}
}

class Message{
	
	String msg;
	
	Message(){
		msg = "No Message Available !!";
	}
	
	void writeMessage(String m){
		msg = m;
		System.out.println("Message Written !!");
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
}

class ReaderThred extends Thread{
	
	Message m;
	
	ReaderThred(Message n){
		m = n;
	}
	
	public void run(){
		synchronized (m) {
			
			try {
				m.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			m.readMessage();
			
			
		}
	}
	
}

class WriterThred extends Thread{
	
	Message m;
	
	WriterThred(Message n){
		m = n;
	}
	
	public void run(){
		synchronized (m) {
			m.writeMessage("Search the candle rather than cursing the darkness !!");
			//m.notify();
			m.notifyAll();
		}
	}
	
}

public class WaitNotify {

	public static void main(String[] args) {
		
		Message m = new Message();
		//m.writeMessage("Be Exceptional !!");
		//m.readMessage();
		
		ReaderThred rt1 = new ReaderThred(m);
		ReaderThred rt2 = new ReaderThred(m);
		
		WriterThred wt1 = new WriterThred(m);
		
		rt1.start();
		rt2.start();
		
		wt1.start();
	}

}
