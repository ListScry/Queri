package queri;
import java.io.*;

public class IO {
	
	// Static initializer.
	public static void setUp(){
		System.out.println("IO Set Up");
	}
	
	/*
	 * Prompts user for input via Standard In.
	 * Arg1 - String that appears before user input.
	 */
	public static String userInput(String prompt){
		
	    BufferedReader stdin = new BufferedReader
	      (new InputStreamReader(System.in));
	    
	    // Java is dumb - must be initialized.
	    String message = "init"; 
	    
	    System.out.print (prompt);
	    // Flush to empty buffer before user input.
	    System.out.flush();
	    
	    // Perform the read operation from Standard In
	    try{
	    	message = stdin.readLine();
	    }catch (java.io.IOException e) {  
	        System.out.println(e);   
	    }  
	    
	    // Input text is returned so it is usable by caller.
	    return message;
	}
	
}
