package CECS;

import java.util.*;
import java.io.*;

/*
 * Filename: 
 * Purpsose:
 */
public final class OperatingSystem {
//    private NFSServices class_174 = new Library( _preCanned[0] ); 

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
    public void getenvVariable( String Name ){  
        Map<String, String> env = System.getenv();

        System.out.println( "CSULB_HOME" + System.getenv("JAVA_HOME" ) );

        for (String envName : env.keySet()) {
//            System.out.format("%s=%s%n", envName, env.get(envName));
        }
    }

    // 
    // method name: 
    // 
    public void issueSystemCall( String command ){  

        try {
//            Process p = Runtime.getRuntime().exec("uname -a");
            Process p = Runtime.getRuntime().exec("echo $CSULB_HOME");
            p.waitFor();

            BufferedReader reader = new BufferedReader(
            		                    new InputStreamReader( p.getInputStream() ));
            String line = reader.readLine();

            while (line != null) {    
                System.out.println(line);
                line = reader.readLine();
            }

        }
        catch(IOException e1) {
        }
        catch(InterruptedException e2) {
        }

        System.out.println("finished."); 
        
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

//        theSystem.issueSystemCall("" );
        theSystem.getenvVariable("");

    }  // end main()

} 

	


