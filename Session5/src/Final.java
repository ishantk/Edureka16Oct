final class CA{ // class which cannot be extended
	final void show(){ // method which cannot be overrided by child
		
	}
}

//class CB extends CA{
	//void show(){
		
	//}
//}

class CC{
	
}

public class Final {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		final int j = 10;
		//j = 100; // error

	}

}
