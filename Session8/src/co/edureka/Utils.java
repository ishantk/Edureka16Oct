package co.edureka;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Utils {

	public static void main(String[] args) {
	
		Date date = new Date();
		System.out.println("Today is: "+date);
		//System.out.println("Today is: "+date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String formattedDate = sdf.format(date);
		
		System.out.println(formattedDate);
		
		Calendar calendar = Calendar.getInstance();
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mm = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Whats your name ? ");
		String name = scanner.nextLine();
		System.out.println("Hello, "+name+" Good to meet You..!!");
		
	}

}
