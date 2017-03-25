
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Sourav
 *
 *(copyright) protected!
 */

public class ParseXml {

	public static void main(String[] args) {
		
		File xmlInFile = new File(".\\src\\sample.xml");
		Document doc = null;
		String rootElement = "";
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		rootElement = sc.nextLine();
		sc.close();
		
		try {
			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			doc = dBuilder.parse(xmlInFile);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (doc.hasChildNodes()) {

			getNodeDetails(doc.getChildNodes().item(0).getChildNodes(),rootElement);
		}

	}

	private static void getNodeDetails(NodeList childNodes, String rootElement) {
		StringBuilder classFormat = new StringBuilder();
		StringBuilder getterAndSetter = new StringBuilder();
		classFormat.append("package ;\n");
		classFormat.append("\n\nimport javax.xml.bind.annotation.XmlRootElement;\n");
		classFormat.append("import javax.xml.bind.annotation.XmlAttribute;\n");
		classFormat.append("import javax.xml.bind.annotation.XmlElement;\n");
		classFormat.append("import java.util.List;\n");
		classFormat.append("import com.fasterxml.jackson.annotation.JsonProperty;\n\n");
		classFormat.append("@XmlRootElement(name=\"" + rootElement + "\")\n");
		classFormat.append("public class " + rootElement + " {\n");
		boolean isListPresent = false;
		if(childNodes.getLength()/2 >1){
			if((childNodes.item(1).getNodeName().equals(childNodes.item(3).getNodeName()))){
				isListPresent = true;
			}
			
		}
		for(int i=1; i<childNodes.getLength() && !isListPresent;i+=2){
			
			Node node = childNodes.item(i);
			int noOfChild = node.getChildNodes().getLength() / 2;     // total no of child nodes
			
			if((noOfChild > 0 || node.getAttributes().getLength()>0) && isListPresent == false){
				
				classFormat.append("	private " + node.getNodeName() + " " + node.getNodeName().toLowerCase() + ";\n");
				getterAndSetter.append("\n");
				getterAndSetter.append("	@XmlElement(name=\"" + node.getNodeName() + "\")\n");
				getterAndSetter.append("	@JsonProperty(\"" + node.getNodeName() + "\")\n");
				getterAndSetter.append("	public " + node.getNodeName() + " get" + node.getNodeName() + "() {\n");
				getterAndSetter.append("		return " + node.getNodeName().toLowerCase() + ";\n");
				getterAndSetter.append("	}\n\n");
				
				getterAndSetter.append("	public void set"+node.getNodeName()+"(" + node.getNodeName() + " " + node.getNodeName().toLowerCase() + ") {\n");
				getterAndSetter.append("		this." + node.getNodeName().toLowerCase() + " = " + node.getNodeName().toLowerCase() + ";\n");
				getterAndSetter.append("	}\n\n");
				
			
			} else {
				
				classFormat.append("	private String " + node.getNodeName() + ";\n");
				getterAndSetter.append("\n");
				getterAndSetter.append("	@XmlElement(name=\"" + node.getNodeName() + "\")\n");
				getterAndSetter.append("	@JsonProperty(\"" + node.getNodeName() + "\")\n");
				getterAndSetter.append("	public String" + " get" + node.getNodeName() + "() {\n");
				getterAndSetter.append("		return " + node.getNodeName() + ";\n");
				getterAndSetter.append("	}\n\n");
				
				getterAndSetter.append("	public void set"+node.getNodeName()+"(String" + " " + node.getNodeName().toLowerCase() + ") {\n");
				getterAndSetter.append("		" + node.getNodeName() + " = " + node.getNodeName().toLowerCase() + ";\n");
				getterAndSetter.append("	}\n\n");
			}
			
			
			
		}
		
		if(isListPresent){
			Node node = childNodes.item(1);
			classFormat.append("	private List<" + node.getNodeName() + "> " + node.getNodeName().toLowerCase() + "List;\n");
			getterAndSetter.append("\n");
			getterAndSetter.append("	@XmlElement(name=\"" + node.getNodeName() + "\")\n");
			getterAndSetter.append("	@JsonProperty(\"" + node.getNodeName() + "\")\n");
			getterAndSetter.append("	public List<" + node.getNodeName() + "> get" + node.getNodeName() + "() {\n");
			getterAndSetter.append("		return " + node.getNodeName().toLowerCase() + "List;\n");
			getterAndSetter.append("	}\n\n");
			
			getterAndSetter.append("	public void set"+node.getNodeName()+"(List<" + node.getNodeName() + "> " + node.getNodeName().toLowerCase() + ") {\n");
			getterAndSetter.append("		this." + node.getNodeName().toLowerCase() + "List = " + node.getNodeName().toLowerCase() + ";\n");
			getterAndSetter.append("	}\n\n");
		}
		
		classFormat.append(getterAndSetter.toString());
		classFormat.append("}");
		
		//save String to file
		FileOutputStream fop = null;
		File file;
		
		file = new File("C:\\Users\\1240848\\Desktop\\pojo\\" + rootElement + ".java");
		String content = classFormat.toString();
		try {
			fop = new FileOutputStream(file);
			if (!file.exists()) {
				file.createNewFile();
			}
			byte[] contentInBytes = content.getBytes();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<childNodes.getLength();i++){
			Node node = childNodes.item(i);
			if((node.hasChildNodes() && node.getChildNodes().getLength()/2 >= 1)) {
				
				getNodeDetails(node.getChildNodes(), node.getNodeName());
				if(isListPresent){
					break;
				}
			}
			
			if(node.hasAttributes()) {
				System.out.println(node.getNodeName() + " " +node.hasAttributes());
				getAttrDetails(node.getAttributes(),node.getNodeName());
				if(isListPresent){
					break;
				}
			}
		}
		
	}

	private static void getAttrDetails(NamedNodeMap attributes, String nodeName) {
		System.out.println("in attr");
		StringBuilder classFormat = new StringBuilder();
		StringBuilder getterAndSetter = new StringBuilder();
		classFormat.append("package ;\n");
		classFormat.append("\n\nimport javax.xml.bind.annotation.XmlRootElement;\n");
		classFormat.append("import javax.xml.bind.annotation.XmlAttribute;\n");
		classFormat.append("import javax.xml.bind.annotation.XmlElement;\n");
		classFormat.append("import java.util.List;\n");
		classFormat.append("import com.fasterxml.jackson.annotation.JsonProperty;\n\n");
		classFormat.append("@XmlRootElement(name=\"" + nodeName + "\")\n");
		classFormat.append("public class " + nodeName + " {\n");
		for(int j=0;j<attributes.getLength();j++){
			Node attr = attributes.item(j);
			classFormat.append("	private String " + attr.getNodeName() + ";\n");
			getterAndSetter.append("\n");
			getterAndSetter.append("	@XmlAttribute(name=\"" + attr.getNodeName() + "\")\n");
			getterAndSetter.append("	@JsonProperty(\"" + attr.getNodeName() + "\")\n");
			getterAndSetter.append("	public String" + " get" + attr.getNodeName() + "() {\n");
			getterAndSetter.append("		return " + attr.getNodeName() + ";\n");
			getterAndSetter.append("	}\n\n");
			
			getterAndSetter.append("	public void set"+attr.getNodeName()+"(String" + " " + attr.getNodeName().toLowerCase() + ") {\n");
			getterAndSetter.append("		" + attr.getNodeName() + " = " + attr.getNodeName().toLowerCase() + ";\n");
			getterAndSetter.append("	}\n\n");
			
		}
		classFormat.append(getterAndSetter.toString());
		classFormat.append("}");
		
		FileOutputStream fop = null;
		File file;
		
		file = new File("C:\\Users\\1239464\\Desktop\\PoJos\\" + nodeName + ".java");
		String content = classFormat.toString();
		try {
			fop = new FileOutputStream(file);
			if (!file.exists()) {
				file.createNewFile();
			}
			byte[] contentInBytes = content.getBytes();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
