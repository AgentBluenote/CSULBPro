package CECS;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


// Utility class
// 
// 
// A = P( 1 + r/n ) nt ( n = number of times interest is compounded per unit of time )
// 
// rate = .0425 annually for 30 years 
// 
// 
// 


public class MISC {

    //
    //
    //
    public static void TRACE( StringBuilder in_arg ){

    }

    //
    //
    //
    public static void mortgaugePayment( int purchase_price ){
      // interest formula here.
    }

    //
    //
    //
    public static void mnRule( int base, int positions ){
        double result;

        result = Math.pow( base, positions );
	
        System.out.println("BASE: " + base + " POSITIONS: " 
                                           + positions + "\nCombinations: " 
                                           + result );
    }
    
    // 
    // method name: 
    // 
    public static ArrayList issueSystemCall( String command ){  
        ArrayList<String> ret_array = new ArrayList<String>();

        System.out.println("issueSystemCall(  String command )"); 

        try {
            Process p = Runtime.getRuntime().exec( command );
            p.waitFor();

            BufferedReader reader = new BufferedReader(
            		                    new InputStreamReader( p.getInputStream() ));
            String line = reader.readLine();
            
            ret_array.add ( line );

            while (line != null) {    
//                System.out.println(line);
                line = reader.readLine();

                ret_array.add ( line );
            }
        }
        catch(Exception e ) {
        	e.printStackTrace( );
        }

        System.out.println("finished."); 

        return ret_array;
    }
    

    //
    // method name:
    //
    public static void readXMLfile( StringBuilder in_path, String in_filename ) {

        ArrayList<Student> ret_array  = new ArrayList<Student>();
        UnknownStudent stud           = new UnknownStudent();

        DocumentBuilderFactory m_dbFactory = null; 
        DocumentBuilder        m_dBuilder  = null; 
        Document               m_doc       = null; 
        File                   m_xmlFile   = null; 
        String text_element = new String(); 


        m_xmlFile = new File( in_path.append( in_filename ).toString() );
    	
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
	            
                text_element =  eElement.getElementsByTagName("firstname").item(0).getTextContent();
	            System.out.println("First Name : " + text_element );
	            
//	            stud.setName( text_element);
//	            stud.getName( );

	            text_element = eElement.getElementsByTagName("lastname").item(0).getTextContent();
	            System.out.println("Last Name : " + text_element );

	            text_element = eElement.getElementsByTagName("nickname").item(0).getTextContent();
	            System.out.println("Nick Name : " + text_element );
	            
	            text_element = eElement.getElementsByTagName("gangaffiliation").item(0).getTextContent();
	            System.out.println("GangAffiliation : " + text_element );

	            text_element = eElement.getElementsByTagName("slogan").item(0).getTextContent();
	            System.out.println("slogan : " + text_element );

	        }
       }

       } catch (Exception e) {
              e.printStackTrace();
       }  

    } // end readXMLFile()
    
    
		
    //
    // main()
    //
    public static void main(String[] argv) {
         String filename    = new String( "gangland.xml");

    	 StringBuilder path = new  StringBuilder( System.getenv( "CSULB_EXP" ) );

         System.out.println( "path: " + path.toString() ); 

        //
        // must have fully qualified path and filename.
        //
        if ( argv.length == 0){  
            System.out.println("command line param:argv[0] " + "No input argument" );

        }
        else{ 
            System.out.println("command line param:argv[0] " + argv[0] );
        }

//       MISC.getenvVariable( "CSULB_EXP");  -- deprecated

 //      MISC.mnRule(2, 8 );
  //     MISC.issueSystemCall( "uname -a" );
       
       MISC.readXMLfile( path, filename);  // MIKE use hash table for return value.

       // To send One package:
    }		

}

