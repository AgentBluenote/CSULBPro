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

    private static UnknownStudent m_criminal  =  new UnknownStudent();  

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
    public static UnknownStudent getCriminal( String subtype ){

    	switch ( subtype ){   // we know the name of the student

    	    case "Allison":
               System.out.println("Criminal Name:  Robert Allison." );
               m_criminal  =  new UnknownStudent(    "~tallison",
                                          " port 100  " ,
                                          " Apache 2.0  \"the License\"" );
    	        break;

    	    case "Dr. Volper":

               System.out.println("Dennis Volper" );
               m_criminal  =  new UnknownStudent(    "~dvolper ",
                                          " port( 22 ) " ,
                                          " Safari License! " );
    	        break;

    	    case "Dr. Eshagian":
               System.out.println("Miss E." );
               m_criminal  =  new UnknownStudent(    "~eshag ",
                                          " port( 69 ) " ,
                                          " class C license" );
    	        break;


    	    case "Tracy":
               System.out.println("Criminal Name:  Tracy T. Maples" );
                m_criminal  =  new UnknownStudent(  "~tmaples",
                                          " port( 555 ) " ,
                                          " BSD " );
    	        break;

    	    case "Princess":
               System.out.println("Criminal Name:  Michael T." );
                m_criminal  =  new UnknownStudent( "~pbravo",
                                          " port( 23 ) " ,
                                          " GPL " );
    	        break;

    	    case "Marlon":
               System.out.println("Criminal Name:  Michael T." );
                m_criminal  =  new UnknownStudent(  "~mbravo",
                                          " port( 23 ) " ,
                                          " GPL " );
    	        break;

    	    case "Random":
               System.out.println("Criminal Name:  Random" );
                m_criminal  =  new UnknownStudent(  "~r",
                                          " port( r ) " ,
                                          " BSD Bull Shit Deamon! " );
    	        break;


    	    default:
//               System.out.println("I am  :  theSpinMaster" );
 //              System.out.println("I was :  theSpinMaster" );
        //       System.out.println("I will:  theSpinMaster" );

    	} // end switch

        return m_criminal;
    }

    //
    // main()
    //
    public static void main(String[] args) {
    	
        StringBuilder path = new  StringBuilder( 
                                    "/home/michael/Project/" + 
                                    "cvs/java8/Trials/src/CECS/" );	

       String                 filename      = new String( "gangland.xml");	
    	
    	
       BotNet  robot               = null; 
       UnknownStudent registered_student  = null; 
       Student unregistered_student      = null; 

       ArrayList<String>  mylist = new ArrayList<String>();
       
       robot                 = new BotNet();
       registered_student    = CriminalFactory.getCriminal("Michael");
       unregistered_student  = CriminalFactory.getCriminal("Mario");

       robot.writeMessage("Blow me a kiss...");

       MISC.readXMLfile( path, filename );  // MIKE left off here.

       mylist = MISC.issueSystemCall( "uname -a" );
       
       // MIKE foreach loop
       for( String i : mylist ){
    	   int j = 0;
           System.out.println("I am :" + mylist.get(j)  );
           j++;
       }

    }
}

