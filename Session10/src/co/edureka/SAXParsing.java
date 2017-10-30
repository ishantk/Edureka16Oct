package co.edureka;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("Document Parsing Started...");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.print(new String(ch,start,length));
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Document Parsing Finished...");
	}
	
}

public class SAXParsing {

	public static void main(String[] args) {
		
		try {
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			FileInputStream fis = new FileInputStream(file);
			
			MyHandler handler = new MyHandler();
					
			parser.parse(fis, handler);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		

	}

}
