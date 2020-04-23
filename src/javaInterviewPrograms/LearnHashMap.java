package javaInterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Map<String, String> objMap = new HashMap<String, String>();
	    objMap.put("Name", "Suzuki");
	    objMap.put("Power", "220");
	    objMap.put("Type", "2-wheeler");
	    objMap.put("Price", "85000");
	    System.out.println("Elements of the Map:");
	    System.out.println(objMap);
	 if(objMap.containsKey("power"))
	 {
		 System.out.println("contains key");
	 }
		 else
		 {
			 System.out.println("does not contain key");
		 }
	 
	 System.out.println("---------");
	 System.out.println(objMap.keySet());
	 System.out.println(objMap.values());
	 System.out.println(objMap.isEmpty());
	  }
}