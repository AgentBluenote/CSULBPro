package CECS;

import java.util.*;

import CECS.Platform.HexStack;

/*
 *  Filename: 
 *  Purpose: 
 *  Algorithm to find . out who is "Ca-Hoots" with the "spin-master"
 *
 *  return next Library that gets loaded by OS.   
 *  dll's are pulled in @ runtime. 
 *  for the App to work all 31 dll must load and execute. 
 */
public final class JVMRunTime{
     
    private static ArrayList<NFSServices> m_pipeline = new ArrayList<NFSServices>();   
    private static String m_jvm                      = new String(); 
    private static int IP                          = 0;  // Instruction Pointer 

    //
    // default constructor
    //
    public JVMRunTime(){
    }

    //
    // constructor signiture II
    //
    public JVMRunTime( NFSServices arg ){
        m_jvm = "Hot Spot 2.0";

//    	NFSServices handle  =  CriminalFactory.getCriminal ( "Marlon" ); 
        m_pipeline = new ArrayList<NFSServices>();  
 //       m_pipeline.add( handle );
    }

    //
    // method name:
    //
    public void setJVM(String arg){  
        m_jvm = arg; 
    }

    //
    // method naem:
    //
    public String getJVM(){  
        return m_jvm; 
    }


    //
    // method name:
    //
    public NFSServices requestDynamicLibrary(){  

        NFSServices noun = new Library();
        noun = m_pipeline.get( IP );

	    return noun;
    }

    //
    // main
    //
    public static void main(String[] argv){

        JVMRunTime jvm_runtime = null;
        jvm_runtime = new JVMRunTime(); 
        

      Student  application   = CriminalFactory.getCriminal("Michael" ); 

      // no input 
      if ( argv.length == 0){
          System.out.println("command line param:argv[0] " + "No input argument" );

      }
      // input filename 
      else{
          System.out.println("command line param:argv[0] " + argv[0] );
      }


      application.getName();           
       application.getSSNumber();           
      application.getHomeDirectory();           
      application.getLicenseAgreement();           

//     jvm_runtime.

        
    }
}





