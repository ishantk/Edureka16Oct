package co.edureka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Files {

	File file;	
	FileInputStream fis;
	
	FileReader reader;
	BufferedReader buffer;
	
	FileOutputStream fos;
	
	FileWriter writer;
	
	void readFromFile(){
		
		try {
			
			file = new File("/Users/ishantkumar/Downloads/Threads.java");
			if(file.exists()){
				if(file.isFile()){
					
					/*fis = new FileInputStream(file);
					int ch = 0;
					while((ch = fis.read()) != -1){
						System.out.print((char)ch);
					}*/
					
					reader = new FileReader(file);
					buffer = new BufferedReader(reader);
					
					String line = "";
					while((line = buffer.readLine()) != null){
						System.out.println(line);
					}
					
					buffer.close();
					reader.close();
				}
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	void writeInFile(){
		try {
			
			file = new File("/Users/ishantkumar/Downloads/MyEdurekaFile.txt");
			writer = new FileWriter(file,true); // true -> append mode
			
			//fos = new FileOutputStream(file);
			
			String data = "\nSearch the candle rather than cursing the darkness..!!";
			//String data = "Be Exceptional..!!";
			
			//fos.write(data.getBytes());
			
			writer.write(data);
			
			writer.close();
			//fos.close();
			
			System.out.println("Data Written");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public static void main(String[] args) {
		Files fRef = new Files();
		//fRef.readFromFile();
		fRef.writeInFile();

	}

}
