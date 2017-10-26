
public class WhyMethods {
	
	
	static void printArray(int[] arr){
		
		for(int num : arr){
			System.out.print(num+"  ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {10,20,30,40,50,60,70};
		int[] arr3 = {1,2,3,4,5,3,4,5,6,1,2,4,6,7,1};
		
		
		// Print these Arrays
		/*for(int num : arr1){
			System.out.print(num+"  ");
		}
		
		System.out.println();
		
		for(int num : arr2){
			System.out.print(num+"  ");
		}
		
		System.out.println();
		
		for(int num : arr3){
			System.out.print(num+"  ");
		}*/
		
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);

	}

}
