package CECS;

import java.lang.*;
import java.io.*;


public class Company{ 

    private String companyName = null;
    private String companySlogan = null;
    private FileProcessing fp = null;

	public Company() {

	}
	
	// Setter Methods
	public void setName( String name ){
         companyName = new String(name); 
	}

	public void setSlogan( String slogan ){
         companySlogan = new String(slogan); 
	}

	// Getter Methods
	public void getName(){
         System.out.println( companyName );
	}

	public void getSlogan(){
         System.out.println( companySlogan );
	}
}


