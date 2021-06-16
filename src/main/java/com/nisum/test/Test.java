package com.nisum.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import com.nisum.EachCharCountInArrayList;
import com.nisum.FindOccuOfEachString;

public class Test {
	public static void main(String[] args)
    {
		String quoteArray[] = { "Continuous", "effort", "not", "strength",
	            "nor", "intelligence", "is", "the", "key", "to", " unlocking",
	            "our", "potential" };
		  ArrayList<String> list=new ArrayList<String>(Arrays.asList(quoteArray));
		 
		Map<Character, Integer> eachchar= EachCharCountInArrayList.characterCount(list);
		 System.out.println(eachchar);
		 System.out.println("-----------------------------");
       
    	FindOccuOfEachString findOccuOfEachString=new FindOccuOfEachString();
    	ArrayList<String> findOccerance = new ArrayList<String>();
    	findOccerance.add("ravi");
    	findOccerance.add("kumar");
    	findOccerance.add("chinna");
    	findOccerance.add("chinna");
    	findOccerance.add("kumar");
    Integer count =FindOccuOfEachString.countFrequencies(findOccerance);
    	System.out.println();
    }
	
}
