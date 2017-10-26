
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		//1.
		// We create an array with size as 5, and all elements have an initial value. eg: 0th index has value 10
		int[] arr1 = {10,20,30,40,50}; // Implicit Way
		
		//2. 
		int[] arr2 = new int[]{10,20,30,40,50}; // Explicit Way
		// new -> It says create array dynamically(i.e. at run time) | Heap
		
		// :)
		
		//3. 
		int[] arr3 = new int[5];
		// We create an array with size as 5, and all elements have an initial value 0.
		
		arr3[1] = 100; // Write Operation
		
		for(int n : arr3){
			System.out.print(n+" * ");
		}
		
		//4. 
		int[] arr4;
		arr4 = new int[5];
		
		//5. 
		int a1[],a2[],a3;
		a1 = new int[3];
		a2 = new int[5];
		a3 = 100;
		
		//6.
		int[] a4,a5,a6;
		a4 = new int[2];
		a5 = new int[4];
		a6 = new int[6];

		System.out.println();
		
		char[] chArr = {'A','B','C','D','E'};
		System.out.println(chArr[20]);
		
	}

}
