package CECS;

import java.util.*;

/*
 *  A platform is a combination of different components. 
 *  i.e.  SnapDragon Chipset 
 *        Android OS 
 *        HotSpot JVM  
 *        HTML5 
 *        
 *  i.e.  Sony DS Chipset  ( "DS stands for "Deep Shit" )
 *        Windows embedded ( Speed Kernal ) 
 *       .Net ( Run-Time ) }
 *        HTML5 
 */
public final class Platform {
    // 
    // base16
    // 
    public enum HexStack {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, 
        SEVEN, EIGHT, NINE, TEN, 
        A, B, C, D, E, F, 
    }
    // This is just the type of Platform:  There are 4 layers with 
    // 16 possible combinations. 
    private  HexStack        m_ArchType          =  HexStack.ZERO; 

    private  Hardware        m_architecture      =  new Hardware();
//    private  OperatingSystem m_OSLayer           =  new OperatingSystem(); 
    private  J2EEAppServer      m_ApplicationServer    =  new J2EEAppServer(); 

    // 
    // default Constructor
    // 
    public Platform(){
    }

    // 
    // default Constructor
    // 
    public Platform( HexStack mux ){

    	switch (mux){
    	    case A:
    	    	m_ArchType       = HexStack.A; 
    	        m_architecture   = new Hardware( "MIPS"  );
//    	        m_OSLayer        = new OperatingSystem("Slackware Linux 2.0");
//    	        m_ApplicationServer = new J2EEAppServer( new Library() );

    	        break;

    	    case B:
    	    	m_ArchType       = HexStack.B;
    	        m_architecture   = new Hardware( "MIPS"  );
//    	        m_OSLayer        = new OperatingSystem("Windows embedded MV");
    	        m_ApplicationServer = new J2EEAppServer(  );

    	    case C:
    	    	m_ArchType       = HexStack.C;
    	        m_architecture   = new Hardware( "MIPS"  );
 //   	        m_OSLayer        = new OperatingSystem("Fedora Core");
//    	        m_ApplicationServer = new J2EEAppServer( new Library() );

    	        break;
    	    default:
    	}
    }

    //
    // method name:
    //
 //   public OperatingSystem getOSLayerReference(){
//    	return this.m_OSLayer;
//    }

    //
    // method name:
    //
    public J2EEAppServer getJVMHotSpot(){
    	return this.m_ApplicationServer;
    }


    //
    // method name:`
    //
    private void printPlatformStack(){
    	String temp = new String( );
//    	OS_Reference = new OperatingSystem( );
 //   	J2EEAppServer = new J2EEAppServer( );
//        System.out.println("DEBUG: Insid printPlatformStack()"); 
//                           OS_Reference  = this.m_architecture.getChipSet() );

        System.out.println("DEBUG: Hardware        : " + 
                           this.m_architecture.getChipSet() );

 //       System.out.println("DEBUG: OperatingSystem : " + 
//                           this.m_OSLayer.getOSDescription() );

        System.out.println("DEBUG: VirtualMachine  : " + 
                           this.m_ApplicationServer.getJVM()  );

    }

    //
    // main()
    //
    public static void main(String[] argv) {

        Platform platformStack = new Platform( HexStack.A );

        // no input 
        if ( argv.length == 0){
            System.out.println("command line param:argv[0] " + "No input argument" );

        }
        // input filename 
        else{ System.out.println("command line param:argv[0] " + argv[0] );
        }

        platformStack.printPlatformStack();

    }
}

