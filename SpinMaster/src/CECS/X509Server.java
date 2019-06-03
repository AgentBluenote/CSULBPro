package CECS;

import java.lang.Runtime;
import java.time.LocalDateTime;


//import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;

//
//  Client/Server program for the 
//
//  JSR 1  Latency for "Hard" Real-Time Requirements  
//
//  Reverse Calendar 
//    1.  Calculate the days I got paid.
//          ( Payday was every other Thurday )

//    2.  We will continue on that schedule for my suplimental income.  
//      a. same account ( personnal ),  same name! 
//        
//    
//        
public class X509Server {
	
	private Date date     = new Date(); 
	private long the2Poch = date.getTime(); 

	//
	// experimental inner class 
	//
	public class NestedClass{

		public NestedClass(){
           System.out.println("NestedClass::NestedClass");
	    }

	    public void  printSomething(){
          System.out.println( "This is a nested class, Justin Case.");
	    }
	}

	// 
	// Defualt Constructor 
	// 
	public X509Server(){

	    System.out.println("TimeServer::TimeServer()");

	}
	
    // 
    // Constructor
    // 
	public X509Server( boolean server ){

	    System.out.println( "TimeServer::TimeServer( boolean server)"); 

 	    if( server == true ){

 	        while( true ){
 	        	// 
 	        	// try block for Tread.sleep
 	        	// 
	            try {
	            	this.printCalendarInfo();
					Thread.sleep(1000);  // this is a Handled exception 

				} catch (InterruptedException e) {
					// What do we do here for *this exception? 
					e.printStackTrace();
				}
	        } // end of while
	    }	
	}

    //
    //  Use GregorianCalendar class to figure out all the dates 
	//  for payday for "exempt" employees which was 
	//  every other Thursday. 
    //
	public void printCalendarInfo(){ 

	     // begin output
	    System.out.println("Current Time\n\n" );
	    System.out.println( "Mike was here..");
        System.out.println( "Hello world; the time is now: " + the2Poch );

	    // 
	    // MIKE: fix this: create a GregorianCalendar with the Pacific Daylight time zone
	    // and the current date and time
	    // 
	    Calendar calendar = new GregorianCalendar();

	    // print out a bunch of interesting things
	    System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
	    System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
	    System.out.println("DATE: " + calendar.get(Calendar.DATE));
	    System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
	    System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
	    System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
	    System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
	    System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
	    System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
	}

    //
    // main()
    //
	public static void main( String[] args ) {

	    X509Server timeInstance = null; 
	    X509Server.NestedClass nest = null; 
	    boolean    serverFlag   = true ;  

        timeInstance = new X509Server( serverFlag );  

        //
        // Inner class experiment
        //
	    nest = timeInstance.new NestedClass(); 
	    nest.printSomething();

	    timeInstance.printCalendarInfo();
	}
}


// MIKE errata


	// milestones dates
	//  03-01-2010 Part A
	//  11-01-2010 Part B
	//  03-01-2010 Part C   // includes Travel, curtesy of Pan AM 103 at 10%. 
	//  03-01-2010 Part D   // slice(R..X)  --> {R,S,T,U,V,W,} [Y,Z  // look AT() documentation for slice();


