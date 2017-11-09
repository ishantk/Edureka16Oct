package co.edureka;

interface Cake{
	void makeCake();
}

class ChocolateCake implements Cake{
	public void makeCake() {
		System.out.println("Making a Chocolate Cake");
	}
}

class VanillaCake implements Cake{
	public void makeCake() {
		System.out.println("Making a Vanilla Cake");
	}
}

abstract class CakeDecorator implements Cake{
	
	Cake cake;
	
	public CakeDecorator(Cake cake) {
		this.cake = cake;
	}
	
	public void makeCake() {
		cake.makeCake();
	}
}

class WeddingCakeDecorator extends CakeDecorator{
	
	public WeddingCakeDecorator(Cake cake) {
		super(cake);
	}
	
	public void makeCake() {
		cake.makeCake();
		putCandies();
	}
	
	void putCandies(){
		System.out.println("Decorating the Cake with Candies...!!");
	}
}

public class Decorator {

	public static void main(String[] args) {
		
		Cake cake = new ChocolateCake();
		Cake weddingCake = new WeddingCakeDecorator(new ChocolateCake());
		
		cake.makeCake();
		weddingCake.makeCake();
		

	}

}
