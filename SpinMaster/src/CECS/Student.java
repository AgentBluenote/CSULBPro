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

    private String        m_first_name  = new String("Spin Master"); 
    private String        m_ss_number   = new String("666-66-6666"); 

    private   StringBuilder m_GangAffiliation = new StringBuilder("Peckerwood"); 
    protected StringBuilder m_NickName        = new StringBuilder("Maven ArchType: Lucifer SS"); 
    protected StringBuilder m_home_dir        = new StringBuilder("~Satan696"); 
    protected StringBuilder m_License         = new StringBuilder("CC 2.0 - I am the Devil"); 

//    protected Object proxy = null; // MIKE later 

    // 
    // Constructror
    // 
    public Student() {
        System.out.println( "Inside Student()\n" );
//        System.out.println( "This is where I instantiate them..." );
//        System.out.println( "Generally I use the tip of my Tongue to instntiate them..." );
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

        System.out.println( "Student.getName()" + m_first_name );
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

        System.out.println( "Inisde Student::getSSNumber()   " + m_ss_number );
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
        System.out.println( "this.getHomeDirectory() " + this.m_home_dir );

        return m_home_dir.toString();
    }

    //
    // method name: 
    //
    public void getLicenseAgreement(){
        System.out.println( "Inside Student::getHomeDirectory() " + this.m_home_dir );
    }

    //*********************************************************************** 
    //
    // main() 
    //
    //*********************************************************************** 
    public static void main(String[] args) {

        Student prof_student   = new Student();
        Student           fkey = new KeptWomenStudent();

        prof_student.setName( "Michael J. SpinMaster");
        prof_student.getName();

        prof_student.setSSNumber( "666-65-6666");  
        prof_student.getSSNumber();

        fkey.setName( "Mariana J. Ramirez");
        fkey.getName();

        fkey.setSSNumber( "(714)334-3855 NC - Not a Citizen... KW");
        fkey.getSSNumber();
    }
}


