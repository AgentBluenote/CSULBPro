package CECS;

import java.lang.*;
import java.util.*;
import java.io.*;

// Purpose/Problem:  
//
// Order comes down from the top.  Students are NOT happy with
// with what they are tasked with. 
// They form a "Ruthless Gang of Computer experts to find 
// who holds the note on their debt. 
//  
// They believe to be the works of the "Spin Master" and "Cracker Crunch"  
// Two Aerospace Professionals who took control of the  
// network late 1999 and never seeded control. 
// They have been in control of the network ever since. 
//  
// Function:  
//
// 1. C2 Command and Control Sends Orders Out.
//    Students get the Orders and try to   
//    dissern where they come from. 

//    paridime
//    Master/Slave relationship as C2 ( Command and Control )
//    paid 1.3 Trillion for educational reform. 
//  
//    "Thank You sooo much..."  - perfect example of a "Kept Woman" 
//                              - wow, she was really pretty.
//                                I hope she likes her house.. I put a lot of thought into it!
//
//                                I do need to fine-tune the FPAL to her liking. 
//                                Select houses are equipt with FPAL devices. 
//                                which are highly configurable and extreamly expensive. 
//                                 
//    To program the Field Programmable Array Logic controller we would use                                   
//    sensors and measure the interaction between us.  
//    We can tell what she likes and what I like.   
//    How she reacts to me.  Non-verbal communication and body language.
//   
//  
//    Student Debt - In order to wipe-out their student load, will will provide the 
//                   soft links and API's to find the Hard links and then destroy 
//                   them and burn them down adhearing to the: 
//                   "the Periodic Law"             
//                   
//                   they will have to dance for me and take 1 Year of C++. 
//                   I really do want them to learn... 
//                   My communication with them will influence the next generation. 
//                   with the goal of Provideing real-time help to an independant problem  
//                   solver. 
//     
//  
public class BotNet{
//    private StringBuffer unKnown = new StringBuffer("I am the Devil" ); 

    private Student m_superier = CriminalFactory.getCriminal("Random"); 
    private Student m_downLink       = CriminalFactory.getCriminal("Random"); 

    // 
    // Constructror
    // 
    public BotNet() {
        System.out.println( "Iside BotNet()" );
    }

    // 
    // method name: 
    //
    public void setDownlink( UnknownStudent stud ) {
    	m_downLink = stud;
    }

    // 
    // method name: 
    // 
    public Student getDownlink(){
    	return m_downLink;
    }

    // 
    // method name: 
    //  botnet barks to to a known student
    // 
    public void writeMessage( String order ){
        System.out.println( order );
    }


    //*********************************************************************** 
    //
    // main()
    //
    //*********************************************************************** 

    public static void main(String[] args) {
        BotNet uplink = new BotNet();

        uplink.writeMessage("take the shot"); // "take the shot"    

    }
}











