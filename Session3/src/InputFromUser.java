import java.util.Scanner; // So as to use Scanner in my Program

public class InputFromUser {

	static void calculateAreaOfRectangle(){
		
		Scanner scanner = new Scanner(System.in);      // System.in -> InputStream
		
		System.out.println("Please Enter the Length"); // System.out -> OutputStream
		int length = scanner.nextInt(); // Read an Integer from Console
		
		System.out.println("Please Enter the Breadth");
		int breadth = scanner.nextInt();
		
		int area = length * breadth;
		
		System.out.println("Area is: "+area);

	}
	
	static int squareOfNum(int num){
		int square = num*num;
		return square;
	}
	
	
	public static void main(String[] args) {
		
		calculateAreaOfRectangle();
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Please Enter some Number: ");
		int num = scanner.nextInt();
		
		int result = squareOfNum(num);
		System.out.println("Square of "+num+" is: "+result);
		
		scanner.close();

	}

}
