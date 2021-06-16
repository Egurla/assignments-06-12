package com.nisum.test;

import java.util.ArrayList;

import com.nisum.EachCharCountInArrayList;
import com.nisum.FindOccuOfEachString;

public class Test {
	public static void main(String[] args)
    {
		
		  ArrayList<String> list=new ArrayList<String>();
		  list.add(" Java python Java .net J2EE ");
		  EachCharCountInArrayList.characterCount(list);
		 
       
    	FindOccuOfEachString findOccuOfEachString=new FindOccuOfEachString();
    	ArrayList<String> findOccerance = new ArrayList<String>();
    	findOccerance.add("ravi");
    	findOccerance.add("kumar");
    	findOccerance.add("chinna");
    	findOccerance.add("chinna");
    	findOccerance.add("kumar");
    	findOccuOfEachString.countFrequencies(findOccerance);
    }
}
