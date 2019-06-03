package CECS;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

//import java.io.File;
import java.io.*;
import java.util.*;

public class XMLParser {
    private DocumentBuilderFactory m_dbFactory = null; 
    private DocumentBuilder        m_dBuilder  = null; 
    private Document               m_doc       = null; 
    private File                   m_xmlFile   = null; 
    private StringBuilder          m_path      = new StringBuilder( 
                                       "/home/michael/Project/cvs/java8/Trials/src/CECS/");


    public XMLParser() {
        // default to staff.xml	
        m_xmlFile = new File( "/home/michael/Project/cvs/java8" + 
                              "/Trials/src/CECS/staff.xml" );	

    }

    public XMLParser( String filename ) {

        m_xmlFile = new File( "/home/michael/Project/cvs/" +
                              "java8/Trials/src/CECS/"     + filename );	

        m_path.append( filename ); 

        System.out.println("Inputfile: " +  m_path );
        System.out.println("Inputfile: " +  m_path );
        System.out.println("Inputfile: " +  m_path );
        System.out.println("Inputfile: " +  m_path );
    }

    public void readXMLfile() {
//	    NodeList nList = m_doc.getElementsByTagName("staff");
 //          Node nNode = nList.item(temp);

        try {
	     m_dbFactory = DocumentBuilderFactory.newInstance();
	     m_dBuilder  = m_dbFactory.newDocumentBuilder();

	     m_doc       = m_dBuilder.parse( m_xmlFile );
	     m_doc.getDocumentElement().normalize();

	    System.out.println("Root element :" + m_doc.getDocumentElement().getNodeName());
	    System.out.println("----------------------------");

	    NodeList nList = m_doc.getElementsByTagName("staff");

	    for (int temp = 0; temp < nList.getLength(); temp++) {

	        Node nNode = nList.item(temp);

	        System.out.println("\nCurrent Element :" + nNode.getNodeName());

	        if ( nNode.getNodeType() == Node.ELEMENT_NODE ) {
	            Element eElement = (Element) nNode;

	            System.out.println("Staff id : "
	                               + eElement.getAttribute("id"));

	            System.out.println("First Name : "
	                               + eElement.getElementsByTagName("firstname")
	                                 .item(0).getTextContent());

	            System.out.println("Last Name : "
	                               + eElement.getElementsByTagName("lastname")
	                                 .item(0).getTextContent());

	            System.out.println("Nick Name : "
	                               + eElement.getElementsByTagName("nickname")
	                                 .item(0).getTextContent());

	            System.out.println("Salary : "
	                               + eElement.getElementsByTagName("salary")
	                                 .item(0).getTextContent());

	            System.out.println("Salary : "
	                               + eElement.getElementsByTagName("slogan")
	                                 .item(0).getTextContent());

	        //    eElement.getElementsByTagName("slogan").item(0).getTextContent();
	        }
       }

       } catch (Exception e) {
              e.printStackTrace();
       }  

    } // end readXMLFile()

    //
    // main()
    //
    public static void main(String argv[]) {
        XMLParser dom = null; 
        OutputStream system_call = null; 

        // no input 
        if ( argv.length == 0){  
            System.out.println("command line param:argv[0] " + "No input argument" );
              
            dom = new XMLParser(); 
        }
        // input filename 
        else{ 
            System.out.println("command line param:argv[0] " + argv[0] );
            dom = new XMLParser( argv[0] );
        }

        dom.readXMLfile();

        try{
            Process p = Runtime.getRuntime().exec( "pwd" );
            system_call = p.getOutputStream();

            System.out.println("" );

            
        }
        catch( Exception e){
        }
    } 
}  // end of XMLParser




