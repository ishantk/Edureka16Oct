
public class Strings {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = new String("Hello World");
		
		str1.concat(" This is Java...");
		str2.concat(" This is Java...");
		
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		
		// Any String Manipulation will result into a new String in the memory
		
		// MUTABLE Strings
		// 1. StringBuilder
		// 2. StringBuffer (Thread-Safe) 
		
		StringBuilder sBldr = new StringBuilder("Hello World");
		// StringBuilder sBldr1 = "Hello World"; // err
		StringBuffer sBuf = new StringBuffer("Hello World");
		
		sBldr.append(" This is Java");
		sBuf.append(" This is Java");
		
		System.out.println("sBldr is: "+sBldr);
		System.out.println("sBuf is: "+sBuf);
		
		

	}

}
