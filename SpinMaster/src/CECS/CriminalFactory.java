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
 *        
 *        
 *       JSR 1 JMS Java Message Service 	 
 *       JSR 154 JMS Java Message Service 	 
 *       JSR 907 JTA Java Transaction API  
 *       JSR 356 Java API for WebSocket 
 *       JSR 914 JMS Java Message Service 	 
 *        
 *       *every week and every paycheck for the amplification model. 
 *        
 */
public final class CriminalFactory {

//    private static Student m_criminal  =  new UnknownStudent();  

    // 
    // default Constructor
    // 
    public CriminalFactory(){
    }

    // 
    // method name:
    // 
    // Pattern Type: Factory, which is a creational Pattern 
    //               which is always backed by "Detroit Muscle"
    //
    // T is for Tenure, means they can not lose their job 
    // 
    // Tenure is so rewarding as you do not have to constantly streSS
    // about losing your job, losing your lively-hood 
    //
    // As you NO, if it's a pattern, I can program it.  - annonymous
    // 
    public static Student getCriminal( String subtype ){

//        Student m_criminal  =  new UnknownStudent();  
        Student m_criminal  =  null; 

    	switch ( subtype ){   // we know the name of the student

    	    case "Allison":
               System.out.println("Criminal Name:  Robert Allison." );
               m_criminal  =  new UnknownStudent(    "~tallison",
                                          " port 100  " ,
                                          " Apache 2.0  \"the License\"" );
    	       break;

    	    case "Volper":

               System.out.println("Criminal Name:  Dennis Volper" );
               m_criminal  =  new UnknownStudent(    "~dvolper ",
                                          " port( 22 ) " ,
                                          " Safari License! " );
    	        break;

    	    case "Mariana":
               System.out.println("Criminal Name:  Miss M. Ariana" );
               m_criminal  =  new KeptWomenStudent("~jmariana ",
                                          " port( 69 ) " ,
                                          " class C license" );
    	        break;

    	    case "Veronica":
               System.out.println("Criminal Name:  Veronica Navarro");
                m_criminal  =  new KeptWomenStudent( "~jnavarro",
                                          " port( 69 ) " ,
                                          " GPL " );
    	        break;

    	    case "Marlon":
               System.out.println("Criminal Name: Marlon" );
                m_criminal  =  new UnknownStudent(  "~mbravo",
                                          " port( 23 ) " ,
                                          " GPL " );
    	        break;

    	    case "Random":
               System.out.println("Criminal Name:  Random" );
                m_criminal  =  new UnknownStudent(  "~rand",
                                          " port( r ) " ,
                                          " BSD Bull Shit Deamon! " );
    	        break;

    	    default:
                System.out.println("Criminal Name: default case: return unknown" );
                m_criminal  =  new UnknownStudent(  "~default",
                                          " port( 23 ) " ,
                                          " GPL " );
    	        break;
//               System.out.println("I am  :  theSpinMaster" );

    	} // end switch

        return m_criminal;
    }

    //
    // main()
    //
    public static void main(String[] args) {


    }
}

