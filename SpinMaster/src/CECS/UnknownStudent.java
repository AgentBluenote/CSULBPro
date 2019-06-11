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

    private String m_ss_number    = new String("1(203)666-7777");  // default: possibly "the spinMaster" 
    private String m_student_name = new String("name"); 
    private String m_home_dir     = new String("NFS"); 


    //
    // Constructor
    //
    public UnknownStudent() {
        System.out.println("DEBUG: UnknownStudent(::)" );
    }

    //
    //
    //
    public UnknownStudent( String one, String two, String three) {

        System.out.println("DEBUG: Inside Student( String one, String two, String three )" );

        m_ss_number          = new String(one);  
        m_student_name = new String(two);  
        m_home_dir      = new String(three); 
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
    public String getName(){

        System.out.println( "DEBUG:  " + m_student_name );

        return m_student_name;
    }

    // 
    // method name: 
    // 
    public void setName( String name ){
    	m_student_name = new String( name );
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
        System.out.println( "this.getHomeDirectory() " + this.m_home_dir );

        return m_home_dir.toString();
    }

    //
    // method name: 
    //
    public void getLicenseAgreement(){

        System.out.println( "I use BSD, The Bullshit Deamon... SS - Server Side " );
        System.out.println( "A-PAC 2.0" );
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

        Student csulb_student         = new UnknownStudent();


        csulb_student.getName();
        csulb_student.getSSNumber();

    }
}
    
    /*
     *  private String        m_first_name  = new String("Spin Master"); 
    private String        m_ss_number   = new String("666-66-6666"); 

    private   StringBuilder m_GangAffiliation = new StringBuilder("Peckerwood"); 
    protected StringBuilder m_NickName        = new StringBuilder("Maven ArchType: Lucifer SS"); 
    protected StringBuilder m_home_dir        = new StringBuilder("~Satan696"); 
    protected StringBuilder m_License         = new StringBuilder("CC 2.0 - I am the Devil"); 

     * 
     * 
     *
     */


