package CECS;

import java.lang.*;
import java.util.*;

//  Apache 2.0 "the License" 
public class Criminal implements NFSServices{
    private static int m_instanceNumber  = 0;   

    private String     m_name = null;     // ie  Michael A.
    private String     m_homeDir = null;  // ~marcham
    private String     m_license= null;   //  Apache 2.0 "the License" 

// TBD    private String     m_export_format= null;   
// TBD    private String     m_mission_statement= null; 
	
    // 
    // default Consructor
    // 
    public Criminal() {
    }

    // 
    // Constructorn II
    // 
    public Criminal( String arg_name , String arg_homeDir , 
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
    // interface stuff
    //************************************************************* 

    public String getName(){
        String ret_val = new String();
        ret_val = m_name;
        return ret_val; 
    }

    // 
    // method name:  getHomeDirectory(){ 
    //   .exe .war .ear 
    // 
    public String getHomeDirectory(){

        String ret_val = new String();
        System.out.println("Student Name: " + m_name );
        return ret_val;
    }

    public String getSSNumber(){
        return "sub";
    }

    // 
    // method name: licenseAgreement()  
    //   .exe .war .ear 
    // 
    public void getLicenseAgreement(){
        System.out.println( "Inside Apache 2.0: so you wanted to learn from me huh???" );
    }

//
// main()
//
public static void main(String[] args){

}

}


