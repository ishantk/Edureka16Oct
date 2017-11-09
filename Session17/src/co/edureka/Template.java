package co.edureka;

interface Routine{
	
	void getUp();
	void workHours();
	void sleepOff();
	
}

class Carpenter implements Routine{

	public void getUp() {
		System.out.println("Carpenter gets up at 7AM");
	}

	public void workHours() {
		System.out.println("Carpenter works for at 10 hours");
	}

	public void sleepOff() {
		System.out.println("Carpenter sleeps at 10PM");
	}

}

class SoftwareDeveloper implements Routine{

	public void getUp() {
		System.out.println("SoftwareDeveloper gets up at ?");
	}

	public void workHours() {
		System.out.println("SoftwareDeveloper works for at n hours");
	}

	public void sleepOff() {
		System.out.println("SoftwareDeveloper has sleepless nights !!");
	}

}

public class Template {

	public static void main(String[] args) {
		
		Routine routine = new Carpenter();
		routine.getUp();
		routine.workHours();
		routine.sleepOff();
		
		routine = new SoftwareDeveloper();
		routine.getUp();
		routine.workHours();
		routine.sleepOff();
		

	}

}
