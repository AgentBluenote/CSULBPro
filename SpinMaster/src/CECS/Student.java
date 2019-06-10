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
public class Student extends Observable implements NFSServices{

    private String m_first_name       = new String("Spin Master"); 
    private String m_ss_number  = new String("666-66-6666"); 

    private StringBuilder m_Home_Dir = new StringBuilder("~Satan700"); 
    private StringBuilder m_License  = new StringBuilder("CC 2.0 - I am the Devil"); 

    private StringBuilder m_NickName        = new StringBuilder("Maven ArchType: Lucifer SS"); 

    private StringBuilder m_GangAffiliation = new StringBuilder("Peckerwood"); 

//    protected Object proxy = null; // MIKE later 

    // 
    // Constructror
    // 
    public Student() {
        System.out.println( "DEBUG: Inside Unknown()" );
//        System.out.println( "This is where I instantiate them..." );
//        System.out.println( "Generally I use the tip of my Tongue" );
//        System.out.println( "R.C AKA The G.O.A.T" );
    }

    // 
    // method name: 
    //
    public void setNickName( StringBuilder name) {
        m_NickName.append( name  );
    }

    // 
    // method name: 
    //
    public StringBuilder getNickName(){
        return m_NickName; 
    }
    
    // 
    // method name: 
    //
    public void setGangAffiliation( String strTemp) {
        m_GangAffiliation.append( strTemp  );
    }

    // 
    // method name: 
    //
    public StringBuilder getGangAffiliation(){
        return m_GangAffiliation; 
    }

    // 
    // method name: 
    //
    public void setUnkown( Object arg) {
    }


    //*********************************************************************** 
    //
    // interface methods... 
    //
    //*********************************************************************** 

    // 
    // method name: 
    // 
    public String getName(){

        System.out.println( "DEBUG:  " + m_first_name );
        return m_first_name;
    }

    // 
    // method name: 
    // 
    public void setName( String name ){
    	m_first_name = new String( name );
    }


    //
    // method name: 
    //
    public String getSSNumber(){

        System.out.println( "DEBUG getSSNumber:  " + m_ss_number );
        return m_ss_number; 
    }

    //
    // method name: 
    //
	public void setSSNumber(String ss_number) {
    	m_ss_number = new String( ss_number );
	}
    
    // 
    // method name: 
    // 
    public String getHomeDirectory(){
        System.out.println( "this.getHomeDirectory() " + this.m_Home_Dir );

        return m_Home_Dir.toString();
    }

    //
    // method name: 
    //
    public void getLicenseAgreement(){
        System.out.println( "this.getHomeDirectory() " + this.m_Home_Dir );
        System.out.println( "Unknown: getL3icenseAgreement() " );
    }

    //*********************************************************************** 
    //
    // main() 
    //
    //*********************************************************************** 
    public static void main(String[] args) {

        Student prof_student    = new Student();
        Student python_student = new UnknownStudent();

        prof_student.setName( "Spin Master");
        prof_student.getName();
        prof_student.setSSNumber( "666-66-6666");
        prof_student.getSSNumber();


//        prof_student.getHomeDirectory();
 //       prof_student.getLicenseAgreement();


  //      python_student.getHomeDirectory();
   //     python_student.getLicenseAgreement();
    }

}


