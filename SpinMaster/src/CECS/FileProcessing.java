package CECS;

import java.util.*;
import java.io.*;

public class FileProcessing {
	   private String         m_inFilePath    = null; 
	   private String         m_outFilePath   = null; 

	   private BufferedReader m_inputStream   = null;
       private PrintWriter    m_outputStream  = null;

       private File file      = null; 

       private ArrayList<String> m_bufferedLines = null; 

		// 
		//  name :    FileProcessing()
		// 
		public FileProcessing() {

	        System.out.println( "FileProcessing()" );
		} 


		public void  systemCall() {
			Process run = null;

	        try {
				run = Runtime.getRuntime().exec("ls");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		// 
		//  name :    
		// 
        public void setInFilePath( String inFile ) {
             m_inFilePath = new String( inFile );
             System.out.println(m_inFilePath); 
        }

		// 
		//  name :    
		// 
        public void setOutFilePath( String outFile ) {

             m_outFilePath = new String( outFile );
        }


		// 
		//  method signature : 
		// 
        public ArrayList parseLines() {
        	int index     = 0;
		    String buffer = new String();

        	m_bufferedLines = new ArrayList<String>();
	        
		    try{
		    	// 
		    	// input file
		    	// 
		    	System.out.println( m_inFilePath );

	            m_inputStream = new BufferedReader( new FileReader( m_inFilePath ));
	            m_inputStream.readLine();

		        while ((buffer = m_inputStream.readLine()) != null) {
		        	m_bufferedLines.add(buffer);  
		        	index++;

		            System.out.println("DEBUG: line[" + index + "]"  + buffer);
		        }
	        } 
	        catch(Exception e){
		   	    e.printStackTrace();
		    }

		    return m_bufferedLines;
	    }

		// 
		//  method signature : 
		// 
        public ArrayList parseLinesAlphabetic(){
			java.util.Collections.sort( m_bufferedLines );

			// foreach loop  MIKE
			for(String i : m_bufferedLines ) {
				   System.out.println("where is my C++ book?" + i);
			}

			return m_bufferedLines;
	    }

	    // 
	    // logic to write to a file MIKE 
	    // 
	    public void postLines( String content ){

	    }

        //
		// utility function.  
        //
	    private void PrintLines( ArrayList<String> input){
			int j =0;
			// 
			// just a check
			// 
			j=input.size();
			for(int index = 0; index< j ; index++ ){
		      System.out.println("line[" + index + "] is: " + input.get(index) );
			}
	    }

//////////////////////////////////////////////////////////////////////////////////////////
//
// main()  Driver  
//
//////////////////////////////////////////////////////////////////////////////////////////
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {

			FileProcessing filePro = null;

//		    String         infile  = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
//		                                   "\\devAppSpace\\DBFlatFiles\\bibleVerses.txt";

//		    String         infile  = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
//		                                   "\\devAppSpace\\DBFlatFiles\\List_of_Companies.txt"; 

//		    String         outfile = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
//		                                   "\\devAppSpace\\DBFlatFiles\\characterOutput.txt";

		    String infile = "/home/michael/Project/CSULB/marcham/devAppSpace/DBFlatFiles/companies/List_of_Companies.txt"; 

		    String outfile = "/home/michael/Project/CSULB/marcham/devAppSpace/DBFlatFiles/companies/characterOutput.txt";

		    try {

				Runtime.getRuntime().exec("pwd");

			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}


        	ArrayList<String> lines = new ArrayList<String>();

			filePro = new FileProcessing( );

			filePro.setInFilePath( infile );

			filePro.setOutFilePath(outfile);

			lines = filePro.parseLines();

//			lines = filePro.parseLinesAlphabetic();

			filePro.postLines("We believe it to be the work of \"the SpinManster\"");
			filePro.postLines("who compromised the csulb GRID back in 1999" );
//kkk			filePro.postLines("He's been running shit since then." );

//		    filePro.PrintLines(lines);	

		}
}
    

