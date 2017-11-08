package co.edureka;

//import org.springframework.aop.framework.ProxyFactoryBean;

public class Student {

	int roll;
	String name;
	
	public Student() {
	
	}
	
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// business method
	public void saveMyData(String where){
		System.out.println("DB Operation started to save data in "+where);
		//... DB Instructions
		
		// Assuming DB Operations shall take 2000 milli secs.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//...
		
		System.out.println("DB Operations Finished...");
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]\n"+super.toString();
	}
	
	
	
}
