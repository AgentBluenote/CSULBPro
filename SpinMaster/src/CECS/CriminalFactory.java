package CECS;

import java.util.*;

/*
 *  A platform is a combination of different components. 
 *  i.e.  SnapDragon Chipset 
 *        Android OS 
 *        HotSpot JVM  
 *        HTML5 
 *        
 *  i.e.  Sony DS Chipset  ( "DS stands for "Deep Shit" )
 *        Windows embedded ( Speed Kernal ) 
 *       .Net ( Run-Time ) 
 *        HTML5 
 */
public final class CriminalFactory {

    private static Student m_criminal  =  new Student();  

    // 
    // default Constructor
    // 
    public CriminalFactory(){
    }

    // 
    // method name:
    // 
    public static Student getCriminal( String subtype ){

    	switch ( subtype ){

    	    case "Michael":
               System.out.println(" Michael " );
               m_criminal  =  new Student(    "~marcham",
                                          " port 100  " ,
                                          " Apache 2.0  \"the License\"" );
    	        break;

    	    case "Mario":
               System.out.println(" Mario" );
               m_criminal  =  new Student(    "~mgines",
                                          " port 9  " ,
                                          " Apache 2.0  \"the License\"" );
    	        break;

    	    case "Dennis":

               System.out.println("Dennis " );
               m_criminal  =  new Student(    "~dvolper ",
                                          " port( 22 ) " ,
                                          " Safari License! " );
    	        break;

    	    case "Tu":

               System.out.println("Tu Ngo " );
               m_criminal  =  new Student(    "~tungu ",
                                          " port( 50 ) " ,
                                          " class C license" );
    	        break;

    	    case "Danny":
               System.out.println(" Danny " );
               m_criminal  =  new Student(    "~dmolina",
                                          " port( 50 ) " ,
                                          " GPL " );

    	        break;

    	    case "Princess":
                m_criminal  =  new Student( "~pbravo",
                                          " port( 23 ) " ,
                                          " GPL " );
    	        break;

    	    case "Marlon":
                m_criminal  =  new Student(  "~mbravo",
                                          " port( 23 ) " ,
                                          " GPL " );
    	        break;

    	    case "John":
                m_criminal  =  new Student(  "~jtramel",
                                          " port( 23 ) " ,
                                          " GPL " );
    	        break;

    	    case "Tracy":
                m_criminal  =  new Student(  "~tmaples",
                                          " port( 1028 ) " ,
                                          " BSD " );
    	        break;


    	    default:
               System.out.println(" default case " );

    	} // end switch

        return m_criminal;
    }

    //
    // main()
    //
    public static void main(String[] args) {
       Student stud  = new Student();

       stud = CriminalFactory.getCriminal("Mario");

    }
}

