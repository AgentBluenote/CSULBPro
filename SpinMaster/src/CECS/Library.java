package CECS;

import java.lang.*;
import java.util.*;

// MIKE
public class Library implements NFSServices{

    private static int m_instanceNumber  = 0;   

    private String     m_name = null;     // ie  Michael A.
    private String     m_homeDir = null;  // ~marcham
    private String     m_license= null;   //  Apache 2.0 "the License" 

// TBD    private String     m_export_format= null;   //  Apache 2.0 "the License" 
// TBD    private String     m_mission_statement= null; 
	
    // 
    // default Consructor
    // 
    public Library() {
    }

    // 
    // Constructorn II
    // 
    public Library( String arg_name , String arg_homeDir , 
                                      String arg_license ){
    	m_name    = arg_name; 
    	m_homeDir = arg_homeDir;
    	m_license = arg_license;
        // lib format .h .o .jar
    }
    
    //
    // do a check here to make sure that all the expected libraries are
    // at the right location ( at the right time ) in the expected
    // format ( ie.  .h .o .a .so .jar .war ) 
    //  
    // timeing will matter with dynamic typing but we will implement the  
    // the scheduler first. 
    //  
    public void compileAndLink( /*File input */ ){
    }  

         
    //************************************************************* 
    // interface stuff  MIKE
    //************************************************************* 

    // 
    // method name:  getHomeDirectory(){ 
    //   .ear 
    // 
    public String getName(){
 //       String ret_val = new String();
//        ret_val = m_name;
 //       return ret_val; 
        return "CarMichael takes the lead.." ;
    }

    // 
    // method name:  getHomeDirectory(){ 
    // 
    public String getHomeDirectory(){

        String ret_val = new String();
        System.out.println("Student Name: "  );
        return ret_val;
    }

    // 
    // method name: 
    // 
    public void getLicenseAgreement(){
        System.out.println( "I need \"enginears\" not scab programmers"   );
    }


    // 
    // method name:
    // 
    public String getSSNumber(){
        System.out.println( "Inside getSSNumber() : "  );
        return "Just In Time"; 
    }

	@Override
	public void setName( String name) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSSNumber(String ss_number) {
		// TODO Auto-generated method stub
		
	}

}
