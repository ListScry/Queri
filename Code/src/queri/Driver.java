package queri;
import java.util.*;

public class Driver {


	public static void main(String[] args) {
		// Basic Setup
		Data.setUp();
		IO.setUp();
		
		mainLoop();
	}
	
	
	// Separate function because we may move to different thread.
	public static void mainLoop(){
		String choice = IO.userInput("Enter Text:");
		
		// While loop of choices.
		while(true){
			// exit - Exits the program
			if( choice.equals("exit") ){
				// break out of while loop
				break;
			}
			else if( choice.equals("input") ){
				System.out.println("Data Entry Time!");
				
				String data1 = IO.userInput("Data 1:");
				String data2 = IO.userInput("Data 2:");
				Data.saveData(data1,data2);
			}
			else if( choice.equals("retrieve") ){
				System.out.println("Data Lookup Time!");
				
				String data = IO.userInput("Enter Lookup String:");
				ArrayList<String> ar = Data.getData(data);
				if( ar.size() == 0 )
					System.out.println("No Results");
				else{
					System.out.println("Results:"+ar);
				}
			}
			else{
				System.out.println("Invalid Option, try again.");
			}
			// break out with switch of "exit"
			
			choice = IO.userInput("Enter Option:");
		}
		
		System.out.println("Goodbye!");
	}

}
