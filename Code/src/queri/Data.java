package queri;

import java.util.*;

public class Data {
	
	private static Map<String,String> map1;
	private static Map<String,String> map2;
	
	public static void setUp() {
	    map1 = new Hashtable<String, String>();
	    map2 = new Hashtable<String, String>();
	}
	
	public static void saveData(String data1, String data2){
		// Save data (Dictionary?)
		System.out.println("Saved:"+data1+"+"+data2);
		map1.put(data1, data2);
		map2.put(data2, data1);
	}
	
	public static ArrayList<String> getData(String key){
		ArrayList<String> solutions = new ArrayList<String>();
		
		String result1 = "";
		String result2 = "";
		result1 = map1.get(key);
		result2 = map2.get(key);
		
		if( result1 != null )
			solutions.add(result1);
		if( result2 != null )
			solutions.add(result2);
		
		return solutions;
	}
}
