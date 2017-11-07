package co.edureka;

public class Child extends Father{

	// Attributes
	int vehicles;
	
	public Child() {
	
	}

	public Child(int vehicles) {
		this.vehicles = vehicles;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Child [vehicles=" + vehicles +" - fname="+fname+" - lname="+lname+" - money="+money+"]";
	}
	
}
