package CECS;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

// Utility class
// 
// 
// A = P( 1 + r/n ) nt ( n = number of times interest is compounded per unit of time )
// 
// rate = .0425 annually for 30 years 
// 
// 
public class MISC {
	
	/** Indent level */
    public int indent = 0;

    /** Indentation will be in multiples of basicIndent  */
    public final String basicIndent = "  ";

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
    public static ArrayList<String> issueSystemCall( String command ){  
        ArrayList<String> ret_array = new ArrayList<String>();

//        System.out.println("issueSystemCall(  String command )"); 

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
    // method name:  readXMLfile()
    //
    public static ArrayList<Student> readXMLfile( StringBuilder in_path, String in_filename ) {
    	
         final String outputEncoding = "UTF-8";

        /** Constants used for JAXP 1.2 */
         final String JAXP_SCHEMA_LANGUAGE =
            "http://java.sun.com/xml/jaxp/properties/schemaLanguage";

         final String W3C_XML_SCHEMA =
            "http://www.w3.org/2001/XMLSchema";

         final String JAXP_SCHEMA_SOURCE =
            "http://java.sun.com/xml/jaxp/properties/schemaSource";	
         
//         String filename = null;
         boolean dtdValidate = false;
         boolean xsdValidate = false;
//         String schemaSource = null;
    	

        ArrayList<Student> student_array  = new ArrayList<Student>();
        Student lucky_student             = new KeptWomenStudent();

        DocumentBuilderFactory m_dbFactory = null; 
        DocumentBuilder        m_dBuilder  = null; 
        Document               m_doc       = null; 
        File                   m_xmlFile   = null; 
        String text_element = new String(); 

        m_xmlFile = new File( in_path.append( in_filename ).toString() );

        System.out.println( m_xmlFile ); 

	     m_dbFactory = DocumentBuilderFactory.newInstance();
	     m_dbFactory.setValidating(true);  // added this for dtd MIKE 
	     m_dbFactory.setNamespaceAware(true);
	     
        // Set the validation mode to either: no validation, DTD
        // validation, or XSD validation
        m_dbFactory.setValidating( dtdValidate || xsdValidate);

        if (xsdValidate) {
            try {
                m_dbFactory.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
            } catch (IllegalArgumentException x) {
                // This can happen if the parser does not support JAXP 1.2
                System.err.println(
                    "Error: JAXP DocumentBuilderFactory attribute not recognized: "
                    + JAXP_SCHEMA_LANGUAGE);
                System.err.println(
                    "Check to see if parser conforms to JAXP 1.2 spec.");
                System.exit(1);
            }
        }

        
  // MIKE this is for xdt file 

        // Set the schema source, if any.  See the JAXP 1.2 maintenance
        // update specification for more complex usages of this feature.
//        if (schemaSource != null) {
 //           m_dbFactory.setAttribute(JAXP_SCHEMA_SOURCE, new File(schemaSource));
  //      }  

        // Optional: set various configuration options
//        m_dbFactory.setIgnoringComments(ignoreComments);
 //       m_dbFactory.setIgnoringElementContentWhitespace(ignoreWhitespace);
  //      m_dbFactory.setCoalescing(putCDATAIntoText);
        // The opposite of creating entity ref nodes is expanding them inline
   //     m_dbFactory.setExpandEntityReferences(!createEntityRefs);



        try {
	     m_dBuilder  = m_dbFactory.newDocumentBuilder();
	     

	     // add error handling as annonymous inner class  MIKE
	     m_dBuilder.setErrorHandler(new ErrorHandler() {
	    	    @Override
	    	    public void error(SAXParseException exception) throws SAXException {
	    	        // do something more useful in each of these handlers
	    	        exception.printStackTrace();
	    	    }
	    	    @Override
	    	    public void fatalError(SAXParseException exception) throws SAXException {
	    	        exception.printStackTrace();
	    	    }

	    	    @Override
	    	    public void warning(SAXParseException exception) throws SAXException {
	    	        exception.printStackTrace();
	    	    }
	    	} );

	     m_doc = m_dBuilder.parse( m_xmlFile );  // Document
	     
	     // MIKE 
	     echo( m_doc );
	     
	     m_doc.getDocumentElement().normalize();

	    // In our case is GangEntity
	    System.out.println("Root element :" + m_doc.getDocumentElement().getNodeName());
	    System.out.println("----------------------------");

	    NodeList node_list = m_doc.getElementsByTagName("staff");  // pulls linked-list    
	    
//	    NodeList m_mike =  m_doc.getChildNodes();
//	    Element  elm     = m_doc.getDocumentElement();
//      Node     mike       = elm.getFirstChild();    

//	    System.out.println("m_mike " + m_mike.getLength() + elm.getTagName() );

        // 
        // traverse linked list
	    for (int i = 0; i < node_list.getLength(); i++) {
	        Node next_node = node_list.item(i);  // peel next nodee off the list

	        // 
	        // instantiate new Object.
            lucky_student             = new KeptWomenStudent();

	        System.out.println("\nCurrent Element :" + next_node.getNodeName());

	        if ( next_node.getNodeType() == Node.ELEMENT_NODE ) {
	            Element eElement = (Element) next_node;  // cast interface Node to a concrete class. 

	            System.out.println("Staff id : "
	                               + eElement.getAttribute("id"));
	            
                text_element =  eElement.getElementsByTagName("firstname").item(0).getTextContent();

               System.out.println("First Name : " + text_element );
                lucky_student = CriminalFactory.getCriminal( text_element );
	            
                // set first name
	            lucky_student.setName( text_element);

	            text_element = eElement.getElementsByTagName("lastname").item(0).getTextContent();
//MIKE	           System.out.println("Last Name : " + text_element );


	            text_element = eElement.getElementsByTagName("nickname").item(0).getTextContent();
//MIKE	            System.out.println("Nick Name : " + text_element );
	            
	            // set nick name
	            lucky_student.setNickName( text_element );

	            text_element = eElement.getElementsByTagName("gangaffiliation").item(0).getTextContent();
//MIKE	            System.out.println("GangAffiliation : " + text_element );
  
	            // set gang affiliation as Social Security number. 
	            lucky_student.setSSNumber(text_element );

	            text_element = eElement.getElementsByTagName("slogan").item(0).getTextContent();
//	            System.out.println("slogan : " + text_element );

	            student_array.add( lucky_student );
	        }  // element node MIKE

//	        student_array.add( lucky_student );
//	        System.out.println( student_array.size());

       }  // end for

       } catch (Exception e) {
              e.printStackTrace();
       }  

       return student_array;  // MIKE change form void

    } // end readXMLFile()
    

    /**
     * MIKE this is pretty cool right here. 
     * 
     * Recursive routine to print out DOM tree nodes
     */
    public static void echo(Node n) {
    	 /** Output goes here */
//MIKE        private PrintWriter out;

        /** Indent level */
         int indent = 0;	
    	
        // Indent to the current level before printing anything
//        MISC.outputIndentation();

        int type = n.getNodeType();
        switch (type) {

        case Node.ATTRIBUTE_NODE:
            printlnCommon(n);
            break;
        case Node.CDATA_SECTION_NODE:
            System.out.println("CDATA:");
           printlnCommon(n);
            break;
        case Node.COMMENT_NODE:
            System.out.println("COMM:");
           printlnCommon(n);
            break;
        case Node.DOCUMENT_FRAGMENT_NODE:
            System.out.println("DOC_FRAG:");
            printlnCommon(n);
            break;
        case Node.DOCUMENT_NODE:
            System.out.println("DOC:");
            printlnCommon(n);
            break;
        case Node.DOCUMENT_TYPE_NODE:
            System.out.println("DOC_TYPE:");
            printlnCommon(n);

            // Print entities if any
            NamedNodeMap nodeMap = ((DocumentType)n).getEntities();
            indent += 2;
            for (int i = 0; i < nodeMap.getLength(); i++) {
                Entity entity = (Entity)nodeMap.item(i);
                echo(entity);
            }
            indent -= 2;
            break;
        case Node.ELEMENT_NODE:
            System.out.println("ELEM:");
            printlnCommon(n);

            // Print attributes if any.  Note: element attributes are not
            // children of ELEMENT_NODEs but are properties of their
            // associated ELEMENT_NODE.  For this reason, they are printed
            // with 2x the indent level to indicate this.
            NamedNodeMap atts = n.getAttributes();
            indent += 2;
            for (int i = 0; i < atts.getLength(); i++) {
                Node att = atts.item(i);
                echo(att);
            }
            indent -= 2;
            break;
        case Node.ENTITY_NODE:
            System.out.println("ENT:");
            printlnCommon(n);
            break;
        case Node.ENTITY_REFERENCE_NODE:
            System.out.println("ENT_REF:");
           printlnCommon(n);
            break;
        case Node.NOTATION_NODE:
            System.out.println("NOTATION:");
            printlnCommon(n);
            break;
        case Node.PROCESSING_INSTRUCTION_NODE:
            System.out.println("PROC_INST:");
            printlnCommon(n);
            break;
        case Node.TEXT_NODE:
            System.out.println("TEXT:");
            printlnCommon(n);
            break;
        default:
            System.out.println("UNSUPPORTED NODE: " + type);
            printlnCommon(n);
            break;
        }

        // Print children if any
        indent++;
        for (Node child = n.getFirstChild(); child != null;
             child = child.getNextSibling()) {
            echo(child);
        }
        indent--;
    }
    
    /**
     * Echo common attributes of a DOM2 Node and terminate output with an
     * EOL character.
     */
    public static void printlnCommon(Node n) {
        System.out.println(" nodeName=\"" + n.getNodeName() + "\"");

        String val = n.getNamespaceURI();
        if (val != null) {
            System.out.println(" uri=\"" + val + "\"");
        }

        val = n.getPrefix();
        if (val != null) {
            System.out.println(" pre=\"" + val + "\"");
        }

        val = n.getLocalName();
        if (val != null) {
            System.out.println(" local=\"" + val + "\"");
        }

        val = n.getNodeValue();
        if (val != null) {
            System.out.println(" nodeValue=");
            if (val.trim().equals("")) {
                // Whitespace
                System.out.println("[WS]");
            } else {
                System.out.println("\"" + n.getNodeValue() + "\"");
            }
        }
        System.out.println();
    }

    /**
     * Indent to the current level in multiples of basicIndent
     */
    /*  MIKE
    public static void outputIndentation() {

        for (int i = 0; i < indent; i++) {
            System.out.println(basicIndent);
        }
    }
    */

    
		
    //
    // main()
    //
    public static void main(String[] argv) {
         String filename    = new String( "gangland.xml");
//         String filename    = new String( "employee.xml");

    	 StringBuilder path = new  StringBuilder( System.getenv( "CSULB_XML" ) );

//         System.out.println( "path: " + path.toString() ); 

        //
        // must have fully qualified path and filename.
        //
        if ( argv.length == 0){  
            System.out.println("command line param:argv[0] " + "No input argument" );

        }
        else{ 
            System.out.println("command line param:argv[0] " + argv[0] );
        }

 //      MISC.mnRule(2, 8 );
  //     MISC.issueSystemCall( "uname -a" );
       
       MISC.readXMLfile( path, filename);  // MIKE use hash table for return value.

       // To send One package:
    }		

}

