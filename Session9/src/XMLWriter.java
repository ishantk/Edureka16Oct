import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Student{
	
	// Attributes
	int roll;
	String name;
	int age;
	String address;
	
}

public class XMLWriter {

	public static void main(String[] args) {
		
		// We have a Student Object
		// Data is stored in RAM. Which is Temporary.
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		s1.age = 20;
		s1.address = "Country Homes";
		
		// Create an XML File and store the data in some tags.
		// DOM | Document Object Model
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // Tree Data Structure
			
			Element rootElem = document.createElement("students");
			Element stuElem = document.createElement("student");
			Element rollElem = document.createElement("roll");
			Element nameElem = document.createElement("name");
			Element ageElem = document.createElement("age");
			Element adrsElem = document.createElement("address");
			
			Text rollText = document.createTextNode(String.valueOf(s1.roll));
			Text nameText = document.createTextNode(s1.name);
			Text ageText = document.createTextNode(String.valueOf(s1.age));
			Text addressText = document.createTextNode(s1.address);
			
			rollElem.appendChild(rollText);
			nameElem.appendChild(nameText);
			ageElem.appendChild(ageText);
			adrsElem.appendChild(addressText);
			
			stuElem.appendChild(rollElem);
			stuElem.appendChild(nameElem);
			stuElem.appendChild(ageElem);
			stuElem.appendChild(adrsElem);
			
			rootElem.appendChild(stuElem);
			
			document.appendChild(rootElem);
				
			// Transform document into an XML file
			DOMSource source = new DOMSource(document);
			
			File file = new File("/Users/ishantkumar/downloads/students.xml");
			FileOutputStream fos = new FileOutputStream(file);
			
			StreamResult result = new StreamResult(fos);
			
			// Convert the result into xml, we shall use an API called Transformer
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer tranformer = tFactory.newTransformer();
					
			tranformer.transform(source, result);
			
			System.out.println("XML File Generated....");
			
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}

	}

}
