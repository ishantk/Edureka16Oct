
public class Passing {

	static void printNum(int k){
		System.out.println("k is: "+k);
		k = 100;
	}
	
	static void printArray(int[] a){
		System.out.println("a is: "+a);
		for(int n : a){
			System.out.print(n+"  ");
		}
		a[1] = 123;
	}
	
	int[] methodReturingReference(){
		int[] arr = {1,2,3,4,5};
		
		//..
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int i = 10;
		int[] arr = {10,20,30,40,50};
		
		System.out.println("i is: "+i);		// 10
		System.out.println("arr is: "+arr); // Some Address
		
		int j = i;							// Value Copy
		int[] newArr = arr;					// Reference Copy
		
		System.out.println("j is: "+j);
		System.out.println("newArr is: "+newArr);
		
		printNum(i);     // Passing the Value
		printArray(arr); // Passing the Reference
		
		System.out.println("i is: "+i);
		System.out.println("arr[1] is: "+arr[1]);

	}

}
