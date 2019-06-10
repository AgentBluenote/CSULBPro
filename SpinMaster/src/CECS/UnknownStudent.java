package CECS;

import java.util.*;
import java.lang.*;

// 
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
//
public class UnknownStudent extends Student implements Observer /*implements NFSServices*/{ 

    private String m_SSN = new String("1(203)666-7777");  // default: possibly "the spinMaster" 
    private String m_student_name = new String("name"); 
    private String m_HomeDir = new String("NFS"); 


    //
    // Constructor
    //
    public UnknownStudent() {
        System.out.println("DEBUG: Inside Student()" );
    }

    //
    // Constructor
    //
    public UnknownStudent( String one, String two, String three) {

        System.out.println("DEBUG: Inside Student( String one, String two, String three )" );

        m_SSN     = new String(one);  
        m_student_name   = new String(two);  
        m_HomeDir = new String(three); 
    }

    //
    // method name: getName()
    //
    public String readMessage(){
        return "[source: Message Queue]: Blow me a kiss"; 	
    }
    
    
    
    //************************************************************* 
    //
    // interface stuff
    //
    //************************************************************* 

    //
    // method name: getName()
    //
    public String getName(){
        String ret_val = null; 

//        super.getName();

        System.out.println( "Student.getLicenseAgreement() I don't know my name...");

        ret_val = new String( m_student_name );

        return "ret_val";
    }

    // 
    // method name:  getHomeDirectory(){ 
    // 
    /*
    public String getHomeDirectory(){
        String ret_val = new String();

        System.out.println("Student Name: " );
        return ret_val;
    }
    */

    // 
    // method name: 
    // 
    /*
    public String getSSNumber(){
       return "BSD  Homeie:, 8 hours a day to claim \"exempt\" status ";
    }
    */

    // 
    // method name: licenseAgreement()  
    //  
    // 
    public void getLicenseAgreement(){
        System.out.println( "Student.getLicenseAgreement(): BSD Homie: 8 hours a day to claim \"exempt\" status ");
    }

    // MIKE 
    // interface: Observer 
    // method name: 
    // 
	@Override
	public void update(Observable o, Object arg) {
        System.out.println( "update ( Observabl, arg ");

	}


    //************************************************************* 
    //
    //  main()
    //
    //************************************************************* 
    public static void main(String[] args) {

        Student csulb_student         = new UnknownStudent();


        csulb_student.getName();
        csulb_student.getSSNumber();

//        csulb_student.getHomeDirectory();
 //       csulb_student.getLicenseAgreement();

    }

}

