package CECS;

import java.util.*;
import java.io.*;

/*
 * Filename: 
 * Purpsose:
 */
public final class OperatingSystem {

    private String m_OSDescription = new String("BSD Linux" ); 

    private JVMRunTime m_JavaVirualMachine = new JVMRunTime(); 


    //
    // Constructor: 
    //
    public OperatingSystem(){
        System.out.println("Inside OperatingSystem()");
    }

    // 
    // Constructor II
    // 
    public OperatingSystem( String os  ){
       this.m_OSDescription = os;	
    }

    
    // 
   // method name: 
    // 
    public void setOSDescription( String os){  
       this.m_OSDescription = os;
    }

    // 
    // method name: getOSDescription()
    // 
    public String getOSDescription(){  
     String retValue = null; 
     retValue = new String( m_OSDescription );
     return retValue; 
    }

    // 
    //  method name:  isApplicationLoadable() 
    // 
    public void isApplicationLoadable(){
         // Michael registered
         // Mario registered
         // James registered
         // Marlon registered
         // Alex registered

        // Application.isLoadable
    }

    // 
    //  method name: loadApp( Library app )
    // 
    public void loadApp( Library app ){

    }

    // 
    // method name: 
    // 
    public void setRuntime( JVMRunTime runtime ){  
       m_JavaVirualMachine = runtime; 
    }

    /////////////////////////////////////////////////////////////////////////
    //
    // main()
    //
    /////////////////////////////////////////////////////////////////////////

    public static void main( String[] argv) {
        OperatingSystem theSystem = null; 

        if ( argv.length > 0 )
            System.out.println("command line param:argv[0] " + argv[0] );

        theSystem = new OperatingSystem();
        theSystem.setRuntime( new JVMRunTime()); 
        theSystem.setOSDescription( "MAC OS");  // auto drive-by 

//        MISC.issueSystemCall("ls ./src/CECS -lrt");

    }  // end main()

} 

	


