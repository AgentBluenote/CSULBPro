package CECS;

import java.util.*;

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
     
    private static ArrayList<NFSServices> pipeline = new ArrayList<NFSServices>();   
    private static String jvm                      = new String(); 
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
        jvm = "Hot Spot 2.0";

//    	NFSServices handle  =  CriminalFactory.getCriminal ( "Marlon" ); 
        pipeline = new ArrayList<NFSServices>();  
 //       pipeline.add( handle );
    }

    //
    // method name:
    //
    public static void setJVM(String arg){  
        jvm = arg; 
    }

    //
    // method naem:
    //
    public static String getJVM(){  
        return jvm; 
    }


    //
    // method name:requestDynamicLibrary 
    //
    public static NFSServices requestDynamicLibrary(){  

        NFSServices noun = new Library();
        noun = pipeline.get( IP );

	return noun;
    }

    //
    // main
    //
    public static void main(String[] args){

        JVMRunTime rt = null;
        rt = new JVMRunTime(); 
    }
}





