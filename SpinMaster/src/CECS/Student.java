package CECS;

import java.util.*;
import java.lang.*;




//    Scechdule of classes
//       Full time - Recieves fulltime financial aid.  ( 12+ Units ) 
//       Full time - Recieves part-time finacial aid.  ( 6 
//    Stafford loans with be dispersed at my discretion. 
//      *Note: this applies for both subsidised and unsubsidised loans. 
//
//    Declation of Major -
//    Certified Major Requirments  - Must speak with Department Councelor. 
//      *Note: this prevents what?
//      
//    Conformed Copy - A conformed copy basically states. You will do as your 
//                       told `or` die. 
public class Student extends Unknown implements NFSServices{ 

    private String m_SSN = new String("1(203)666-7777");  //*this is Hugs and Kisses....  
                                                  // default: possibly "the spinMaster" 
    private String m_Name = new String("name");  //*this is Hugs and Kisses....  
    private String m_HomeDir = new String("NFS");  //*this is Hugs and Kisses....  

    //
    // Constructor
    //
    public Student() {
        System.out.println("DEBUG: Inside Student()" );
    }

    //
    // Constructor
    //
    public Student( String one, String two, String three) {
//  System.out.println("DEBUG: Inside Student( String one, String two, String three )" );

        m_SSN = new String(one);  
        m_Name = new String(two);  
        m_HomeDir = new String(three); 

    }

    //************************************************************* 
    // interface stuff // MIKE

    //************************************************************* 

    //
    // method name: getName()
    //
    public String getName(){
        String ret_val = null; 

        ret_val = new String( m_Name );

        return ret_val;
    }

    // 
    // method name:  getHomeDirectory(){ 
    // 
    public String getHomeDirectory(){
        String ret_val = new String();

        System.out.println("Student Name: " );
        return ret_val;
    }

    // 
    // method name: 
    // 
    public String getSSNumber(){
       return "BSD  Homeie:, 8 hours a day to claim \"exempt\" status ";
    }


    // 
    // method name: licenseAgreement()  
    //  
    // 
    public void getLicenseAgreement(){
        System.out.println( "getLicenseAgreement  I use BSD" );
    }


    ///////////////////////////////////////////////////////////////////////////
    // main()
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        Unknown known_student         = new Student();
        Unknown unknown_student   = new Unknown();

//        Runtime p = Runtime.getRunTime().exec( "uname -a" );
//        Runtime.getRunTime().exec( "uname -a" );

        unknown_student.getName();
        unknown_student.getSSNumber();
        unknown_student.getHomeDirectory();
        unknown_student.getLicenseAgreement();

        known_student.getName();
        known_student.getSSNumber();
        known_student.getHomeDirectory();
        known_student.getLicenseAgreement();
    }
}

