package co.edureka.exceptions;

class Area{
	void calculateArea(){
		
	}
}


public class Exceptions {

	public static void main(String[] args) {
		System.out.println("Application Started..");
		
		int[] arr = {10,20,30,40,50};
		
		try{
			System.out.println("arr[2] is: "+arr[2]);
			
			Area aRef = null;
			aRef.calculateArea();
			
			
			
		}/*catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Some Exception Occured !!");
		}catch(NullPointerException npe){
			System.out.println("Some Exception Occured !! "+npe);
			//npe.printStackTrace();
		}*/catch(Exception e){ // RTP
			System.out.println("Exception is: "+e);
			e.printStackTrace();
		}finally{
			int a = 10;
			int b = 3;
			int c = a/b;
			System.out.println("c is: "+c);
		}
		
		
		
		
		System.out.println("Application Finished..");
	}

}
