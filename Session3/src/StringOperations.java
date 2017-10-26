
public class StringOperations {

	public static void main(String[] args) {
		
		String str1 = "Mr.";
		String str2 = "John Watson";
		
		System.out.println(str1+" "+str2);
		
		// Concat Strings
		//String str3 = str1 +" "+ str2;
		
		String str3 = str1.concat(" ").concat(str2);
		System.out.println(str3);
		
		// Strings are IMMUTABLE. You cannot change them.
		String str4 = "This is Awesome";
		String str5 = str4.toUpperCase(); // Convert str4 to Upper Case
		System.out.println("str4 is: "+str4);
		System.out.println("str5 is: "+str5);
		
		// str4 -> 2501
		// str4 -> 2601
		str4 = str4.toLowerCase(); // This produces memory leaks
		
		System.out.println(str4.toLowerCase()); // A newly created String will be printed, but their is no reference pointing to the String and this is again a reason to memory leak
		
		
		String str6 = "John, Jennie, Jim, Jack";
		int len = str6.length();
		System.out.println("str6 length is: "+len);
		
		String str7 = str6.substring(5,10);//str6.substring(5);
		System.out.println("str7 is: "+str7);
		
		if(str6.contains("Jennie")){
			System.out.println("Jennie is in the list");
		}
		
		//if(str6.equals(str7))
		//if(str6.equalsIgnoreCase(str7))
		
		int idx = str6.lastIndexOf('J');//str6.indexOf('J');
		System.out.println("idx is: "+idx);
		
		String[] strArr = str6.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		//if(str6.startsWith("Jo"))
		//if(str6.endsWith("ck"))
		
		char[] chArr = str6.toCharArray(); // Converts the String into Array of Characters
		int c = 0;
		for(char ch : chArr){
			c++;
		}
		
		System.out.println("Length is: "+c);
	}

}
