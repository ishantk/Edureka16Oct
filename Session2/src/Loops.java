
public class Loops {

	public static void main(String[] args) {
		
		// Table of a Number
		int num = 5;
		
		// Repetitive instructions
		/*System.out.println(num+" 1's are "+(num*1));
		System.out.println(num+" 2's are "+(num*2));
		System.out.println(num+" 3's are "+(num*3));
		System.out.println(num+" 4's are "+(num*4));
		System.out.println(num+" 5's are "+(num*5));
		System.out.println("...");
		System.out.println(num+" 10's are "+(num*10));*/
		
		// Loops
		//1. while loop
		int i = 1;
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println("-----------------");
		
		//2. do while | If condition is false it will execute on a min of 1
		i = 1;
		num = 7;

		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10);
		
		
		System.out.println("-----------------");
		
		//3. for loop
		num = 9;
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
	}

}
