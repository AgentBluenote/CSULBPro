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
public class UnknownStudent extends Student implements Observer { 

      private String m_license = new String(); 
//    private String m_ss_number    = new String("");  // default: possibly "the spinMaster" 
//    private String m_student_name = new String(""); 
    private String m_home_dir     = new String(""); 

    //
    // Constructor
    //
    public UnknownStudent() {
    }

    //
    // Constructor II
    //
    public UnknownStudent( String one, String two, String three) {

//        m_ss_number    = new String(one);  
//        m_student_name = new String(two);  
        m_home_dir     = new String(three); 
    }

    //
    // method name: getName()
    //
    public String readMessage(){
        return "[source: Message Queue]: Blow me a kiss"; 	
    }
    
    //*********************************************************************** 
    //
    // interface methods... 
    //
    //*********************************************************************** 

    // 
    // method name: 
    // 
//    public String getName(){

//        return m_student_name;
 ///   }

    // 
    // method name: 
    // 
//    public void setName( String name ){

 //   	m_student_name = new String( name );
  //  }

    //
    // method name: 
    //
//    public String getSSNumber(){
 //       return m_ss_number; 
  //  }

    //
    // method name: 
    //
//    public void setSSNumber(String ss_number) {
 //       m_ss_number = new String( ss_number );
//    }
    
    // 
    // method name: 
    // 
    public String getHomeDirectory(){
      //System.out.println( "Inside UnknownStudent.getHomeDirectory()   : " 
 //                           + this.m_home_dir );

        return m_home_dir.toString();
    }

    //
    // method name: 
    //
    public String getLicenseAgreement(){
//        System.out.println( "getLicenseAgreement(): \n " 
 //                           +  "I use BSD, The Bullshit Deamon... SS - Server Side " );

         m_license = "I use BSD License, Berkely";

         return m_license; 
    } 
    

    // 
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

        Student csulb_student         = new Student();

//        UnknownStudent default_student         = new UnknownStudent();

        csulb_student.setName("sub");
        csulb_student.getName();

        csulb_student.setSSNumber("subbbbbSS");
        csulb_student.getSSNumber();

        csulb_student.getHomeDirectory();
        csulb_student.getLicenseAgreement();

        csulb_student.getGangAffiliation();
//        csulb_student.readMessage();
    }
}
    


