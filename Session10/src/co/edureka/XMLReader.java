package co.edureka;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class Employee{
	
	int eid;
	String name;
	int age;
	
	Employee(int i, String n, int a){
		eid = i;
		name = n;
		age = a;
	}
	
	@Override
	public String toString() {
		return eid+" - "+name+" - "+age;
	}
}

public class XMLReader {

	public static void main(String[] args) {
		
		try {
			
			ArrayList<Employee> empList = new ArrayList<Employee>();
			
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			
			System.out.println("Root Element : "+document.getDocumentElement().getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println("Number of Nodes : "+nodeList.getLength());
			
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				if(node.getNodeType() == Node.ELEMENT_NODE){
				
					Element element = (Element)node;
					//element.getAttribute("attrName");
					//System.out.println("Eid: "+element.getElementsByTagName("eid").item(0).getTextContent());
					//System.out.println("Name: "+element.getElementsByTagName("name").item(0).getTextContent());
					//System.out.println("Age: "+element.getElementsByTagName("age").item(0).getTextContent());
					
					//System.out.println("------------------------------------");
					
					int id = Integer.parseInt(element.getElementsByTagName("eid").item(0).getTextContent());
					String nm = element.getElementsByTagName("name").item(0).getTextContent();
					int age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());
					
					Employee emp = new Employee(id,nm,age);
					empList.add(emp);
					
				}
			}
			
			for(Employee e : empList){
				System.out.println(e);
				System.out.println("------------------------------------");
			}
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		

	}

}
