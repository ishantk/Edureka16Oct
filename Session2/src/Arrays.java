
public class Arrays {

	public static void main(String[] args) {
		
		int arizonaRepVoteCount = 210;
		int arizonaDemVoteCount = 310;
		//..
		//..
		
		// Multi Value Container
		// Containing 5 values
		int[] repVoteCount = {210,120,450,310,456};
		int[] demVoteCount = {310,150,150,210,816};
		
		System.out.println(arizonaDemVoteCount);
		System.out.println(arizonaRepVoteCount);
		
		System.out.println(repVoteCount); // Reference Variable
		System.out.println(demVoteCount); // Reference Variable

		//Perform Operations on Array
		System.out.println("===============");
		// 1. To Read Single
		System.out.println(repVoteCount[3]);
		
		//2. To Read All : for/while/dowhile loop
		for(int i=0;i<repVoteCount.length;i++){
			System.out.print(repVoteCount[i]+"   ");
		}
		System.out.println();
		
		int rCount = 0, dCount=0;
		//3. To Read All : Enhanced For loop (for-each loop) | Only used to read Arrays
		for(int num : repVoteCount){
			rCount = rCount+num;
			System.out.print(num+" * ");
		}
		
		for(int num : demVoteCount){
			dCount = dCount+num;
			System.out.print(num+" * ");
		}
		System.out.println();
		System.out.println("Republican Vote Count is: "+rCount);
		System.out.println("Democratic Vote Count is: "+dCount);
		
		if(rCount>dCount){
			System.out.println("Republican Party Wins");
		}else{
			System.out.println("Democratic Party Wins");			
		}
	}

}
