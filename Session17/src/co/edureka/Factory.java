package co.edureka;

interface Plan{
	void intializePlan();
	void showPlan();
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	public void intializePlan() {
		data = 1;
		price = 200;
	}

	public void showPlan() {
		System.out.println("Plan 2G is about "+data+" GB of data in \u20b9"+price);
	}

}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	public void intializePlan() {
		data = 2;
		price = 500;
	}

	public void showPlan() {
		System.out.println("Plan 3G is about "+data+" GB of data in \u20b9"+price);
	}

}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	public void intializePlan() {
		data = 5;
		price = 1000;
	}

	public void showPlan() {
		System.out.println("Plan 4G is about "+data+" GB of data in \u20b9"+price);
	}

}

class PlanFactory{
	
	static Plan getPlan(int type){
		
		Plan plan = null;
		
		switch (type) {
			
			case 2:
				plan = new Plan2G();
				break;
	
			case 3:
				plan = new Plan3G();
				break;
				
			case 4:
				plan = new Plan4G();
				break;
				
		}
		
		plan.intializePlan();
		
		return plan;
	}
	
}

public class Factory {

	// Client, is not exposed of how object is created
	public static void main(String[] args) {
		
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();
		

	}

}
