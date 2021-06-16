package com.nisum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class EachCharCountInArrayList {
	
	    public static int characterCount(ArrayList<String> inputString)
	    {
	    	
	    	 String res = null;
	       
	    	StringBuilder sb = new StringBuilder();
	    	 
	        int i = 0;
	        while (i < inputString.size() - 1)
	        {
	        	
	            sb.append(inputString.get(i));
	            
	            i++;
	        }
	         sb.append(inputString.get(i));
	      res = sb.toString();
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	        char[] strArray = res.toCharArray();
	  
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c)) {
	  
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                charCountMap.put(c, 1);
	            }
	        }
	         
	        Set<Integer> set=(Set<Integer>) charCountMap.values();
	        for(Integer count:set) {
	       return count.intValue();
	        }
	        System.out.println(inputString+" : "+charCountMap);
			return i;
			
	    }
	  
	   
}
