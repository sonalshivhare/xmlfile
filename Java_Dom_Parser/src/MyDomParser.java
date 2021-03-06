import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MyDomParser {
public static void main(String[] args) throws SAXException, IOException  {
	 
	try {
		File xmlDoc=new File("Student.xml");
		DocumentBuilderFactory dbfact=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuild=dbfact.newDocumentBuilder();
		Document doc=dBuild.parse(xmlDoc);
		
		//read root element               //doc locate root      //give me its name
		System.out.println("Root element "+doc.getDocumentElement().getNodeName());
		
		//read array of student elements
		//this array is called nodelist
		NodeList nlist =doc.getElementsByTagName("student");
		for(int i=0;i<nlist.getLength();i++){
			
			Node nNode=nlist.item(i);
			System.out.println("Node name:"+nNode.getNodeName()+" "+(i+1));
			
			if(nNode.getNodeType() == Node.ELEMENT_NODE){
				Element eElement=(Element) nNode;
				
				System.out.println("Student id#:"+eElement.getAttribute("id"));
				System.out.println("Student First name:"+eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Student Last name:"+eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Student Score:"+eElement.getElementsByTagName("score").item(0).getTextContent());
				System.out.println("-------------------------------------------------");
				
			}
			
		}
		
		
		
		
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
