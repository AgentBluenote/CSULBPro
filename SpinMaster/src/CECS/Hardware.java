package CECS;

import java.util.*;
import java.io.*;

//
// Filename: Hardware.java 
// Purpose :  ???? "to impose my will"
//
//  This clas will illisrate an ASIC ( Applicaiton Specific Intergrated Circuit )
//  These differ from FPAL in the fact that they cannot be changed coming out 
//    of the factory.

//  __interupt_request
//  setChipset
//  getChipset
public final class Hardware {

    // 80X86x  or MIPS  Only two right now. 
    private String m_chipSet = new String("Intel 80x86 Processor" );  
//    private String m_chipSet = new String("QualComm SnapDragon");  
//    private String m_chipSet = new String("MIPS Student Edition : 
//                             Open-Air");  
//    private String m_chipSet = new String("MIPS Professional    : 
//                             Level 1 Propriatary");  

    //
    // Constructor
    //
    public Hardware(){
    }

    // 
    // Constructor 
    // 1 of 4 ASIC chips 
    //
    public Hardware( String argv ){
        m_chipSet = argv;
    }

    // 
    // method name: getChipSet()
    // 
    public String getChipSet(){
    	String ret_Val = new String();

    	ret_Val = m_chipSet;
  	return ret_Val;
    }


    //
    // method name: 
    //
    public void setChipset( int input ){


        switch( input ){

            case 1:
                m_chipSet = new String("Intel 80x86 Processor" );  
                break;

            case 2:
                m_chipSet = new String("MIPS Student Edition"); 
                break;
        }

    }
    
    //
    // this is my pick up line when I bust them  
    // I bust them so I can give themm a better deal than the one 
    // the cops gave them. 
    // 
    // I don't let them know that though. 
    //
    // Ohh, I think you know what a "chip set" is.
    //
    // It is really the only way to get rid of the PIL  
    // We don't need PIL as we know what Architechture we  
    // will be running. 
    // 
    //
    public String giveUpChipSet(){  // "because I sed"  MA
    	return m_chipSet;  // just a string() for now.
    }


   //*********************************************************
   //
   //*********************************************************

    //  
    //  main()  
    //  
    public void main( String[] args){


    }
}


