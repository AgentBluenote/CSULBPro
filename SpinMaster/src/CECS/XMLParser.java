package CECS;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.*;
import java.util.*;


//
// class XML    --  MIKE  figure out Stax Parser.
//
public class XMLParser {

    public static void readXMLfile( StringBuilder in_path, String in_filename ) {
        DocumentBuilderFactory m_dbFactory = null; 
        DocumentBuilder        m_dBuilder  = null; 
        Document               m_doc       = null; 
        File                   m_xmlFile   = null; 


        m_xmlFile = new File( in_path.append( in_filename ).toString() );

    	
    	System.out.println( "CSULB_HOME: " + System.getenv("CSULB_HOME" ) );

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

	            System.out.println("Affiliation : "
	                               + eElement.getElementsByTagName("gangaffiliation")
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

    /////////////////////////////////////////////////////////////////////////////////
    //
    // main()
    //
    /////////////////////////////////////////////////////////////////////////////////
    public static void main(String argv[]) {

        StringBuilder path = new  StringBuilder( 
    		                                     "/home/michael/Project/" + 
                                                 "cvs/java8/Trials/src/CECS/" );	

        String                 filename      = new String( "gangland.xml");

        //
        // must have fully qualified path and filename.
        //
        if ( argv.length == 0){  
            System.out.println("command line param:argv[0] " + "No input argument" );
              
        }
        else{ 
             System.out.println("command line param:argv[0] " + argv[0] );
        }

        XMLParser.readXMLfile( path, filename );

    } 
}  // end of XMLParser



