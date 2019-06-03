package CECS;

import java.lang.Math;


// Utility class
// 
// 
// A = P( 1 + r/n ) nt ( n = number of times interest is compounded per unit of time )
// 
// rate = .0425 annually for 30 years 
// 
// 
// 


public class MISC {

    //
    //
    //
    public static void TRACE( StringBuilder in_arg ){

    }

    //
    //
    //
    public static void mortgaugePayment( int purchase_price ){
      // interest formula here.
    }

    //
    //
    //
    public static void mnRule( int base, int positions ){
        double result;

        result = Math.pow( base, positions );
	
        System.out.println("BASE: " + base + " POSITIONS: " 
                                           + positions + "\nCombinations: " 
                                           + result );
    }
		
    //
    // main()
    //
    public static void main(String[] args) {
       MISC.mnRule(2, 8 );
       // To send One package:
    }		

}

