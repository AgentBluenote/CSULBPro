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

    private String m_sex               = new String("Male");   // TBD

    private String m_name              = new String("Michael J. SpinMaster");  // interface
    private String m_ss_number         = new String("Michael J. SpinMaster");  // interface

    private String m_home_dir        = new String("~mgines");                        // interface RO 
    private String m_license         = new String("Apache 2.0, \"the License\"");    // interface RO

    private String m_gangaffiliation = new String("X.509er");                        // class   
    private String m_nickname        = new String("BOD's Boys Of Destruction");      // class 

    // 
    // Constructror
    // 
    public Student() {
    }

    // 
    // method name: 
    //
    public String getNickName(){
    	String nick_name = new String( m_nickname );

    	return nick_name;
    }

    // 
    // method name: 
    //
    public void setNickName( String name) {
        m_nickname = name; 
    }

    // 
    // method name: 
    //
    public String getGangAffiliation(){
    	String gang = null; 
    	gang = new String( m_gangaffiliation );
    	return gang;
    }

    // 
    // method name: 
    //
    public void setGangAffiliation( String gang) {
        m_gangaffiliation =  new String (gang );
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
    	String gang = new String( m_name );

        return m_name;
    }

    // 
    // method name: 
    // 
    public void setName( String name ){
    	m_name = new String( name );
    }


    //
    // method name: 
    //
    public String getSSNumber(){
    	String gang = new String( m_ss_number );

        return m_ss_number; 
    }

    //
    // method name: 
    //
    public void setSSNumber(String ss_number) {
//        System.out.println( "Inside Student.setSSNumber() " 
 //                           + ss_number );

        m_ss_number = new String( ss_number );
    }

    // 
    // method name: 
    // 
    public String getHomeDirectory(){
        System.out.println( "Inside Student.getHomeDirectory() " + m_home_dir );

        return m_home_dir.toString();
    }

    //
    // method name: 
    //
    public String getLicenseAgreement(){
        System.out.println( "Inside Student.getLicenseAgreement():  " + m_license );
        return m_license; 
    }

    //*********************************************************************** 
    //
    // main() 
    //
    //*********************************************************************** 
    public static void main(String[] args) {

        Student prof_student   = new Student();


        prof_student.setName( "Lissette");
        prof_student.getName();

        // Pacific Woods apt. land line. 
        prof_student.setSSNumber( "949-557-5807"); 
        prof_student.getSSNumber();

        prof_student.setNickName( "Sweet Pea");
        prof_student.getNickName();

        prof_student.setGangAffiliation( "Soft Side Crypts!" );
        prof_student.getGangAffiliation();


        System.out.println( "Inside Student()\n" );

    }
}

//        System.out.println( "This is where I instantiate them..." );
//        System.out.println( "Generally I use the tip of my Tongue to instntiate them..." );
//        System.out.println( "R.C AKA The G.O.A.T" );




















