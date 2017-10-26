
public class ArrayOfArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		System.out.println("Size of arr1 is: "+arr1.length);
		System.out.println("arr1[0] is: "+arr1[0]);
		
		int[][] arr2 = {
							{10,20}, //0
							{10,20,30,40,50}, //1
							{10,20,30},
							{10},
							{10,20,30,40} //2
					   };
		
		System.out.println("Size of arr2 is: "+arr2.length); // 5
		System.out.println("Size of arr2[0] is: "+arr2[0].length); // 2
		System.out.println("Size of arr2[3] is: "+arr2[3].length); // 1
		
		// read an element 
		System.out.println("arr2[1][2] : "+arr2[1][2]); // 30
		
		// read all
		for(int i=0;i<arr2.length;i++){ // 5
			for(int j=0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println();
		}
		
		// No Initial Vlaues for below Arrays
		int[][] arr3 = new int[3][3]; // we got 3 arrays with each array having 3 elements
		
		int[][] arr4 = new int[3][];
		arr4[0] = new int[2];
		arr4[1] = new int[4];
		arr4[2] = new int[6];
		
		int[][]x = new int[5][5]; // ?
		//5 Arrays with 5 elements each : 25 elements X 4bytes -> 100 bytes

	}

}
