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
public class Unknown extends Observable implements NFSServices{
    private StringBuffer unKnown = new StringBuffer("I am the Devil" ); 

    private StringBuffer m_name = new StringBuffer("I am the Devil" ); 
    private StringBuffer m_SSN = new StringBuffer("I am the Devil" ); 
    private StringBuffer m_license = new StringBuffer("I am the Devil" ); 

    protected Object proxy = null; 


    // 
    // Constructror
    // 
    public Unknown() {
        System.out.println( "DEBUG: Inside Unknown()" );
//        System.out.println( "This is where I instantiate them..." );
//        System.out.println( "Generally I use the tip of my Tongue" );
//        System.out.println( "R.C AKA The G.O.A.T" );
    }

    // 
    // method name: 
    //
    public void setUnkown( Object arg) {
///        m_SS = m_name; 
    }

    // 
    // method name: 
    // 
  //  public Unknown getUnkown(){
//        return m_SS;
 //   }
 

    //*********************************************************************** 
    // interface methods... 
    //*********************************************************************** 


    // 
    // method name: 
    // 
    public String getName(){
        return "mikey";
    }


    //
    // method name: 
    //
    public String getSSNumber(){
        
        System.out.println( "PGP or Pretty Good Privacy!" );
        return "mike";
    }
    
    // 
    // method name: 
    // 
    public String getHomeDirectory(){
        return "mike";
    }

    //
    // method name: 
    //
    public void getLicenseAgreement(){
        System.out.println( "inside getLicenseAgreement " );
    }




    //
    // main()
    //
    public static void main(String[] args) {

        Unknown prof_student    = new Unknown();
        Unknown python_student = new Student();

        prof_student.getName();
        prof_student.getSSNumber();
        prof_student.getHomeDirectory();

        python_student.getName();
        python_student.getSSNumber();
        python_student.getHomeDirectory();
    }
}


