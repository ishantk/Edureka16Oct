
public class Strings {

	public static void main(String[] args) {
		
		// char is a primitive data type. i.e. Single Value Container
		char ch = 'A';
		
		// String is a class in java. It is a Reference Type. Its is Multi Value Container
		String str1 = "Hello World"; // str1 is a reference variable, like arr in arrays.
		
		System.out.println("ch is: "+ch);
		System.out.println("str1 is: "+str1); // the magic is, we cannot see address, we are directly seeing the value
		// how this magic happens, we see it later
		
		String str2 = "Hello World"; // Interned Way
		
		String str3 = new String("Hello World"); // Non Interned Way | You Create Object of String here
		String str4 = new String("Hello World"); 
		
		// Reference Variables are Compared
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		//if(str3 == str4){ // Compare Reference Variables
		if(str3.equals(str4)){  // Compare Value 
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		//if(str1 == str3){
		if(str1.equals(str3)){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}


		System.out.println(str1); // We are not seeing the address, but we are seeing the values (this is magical)
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
