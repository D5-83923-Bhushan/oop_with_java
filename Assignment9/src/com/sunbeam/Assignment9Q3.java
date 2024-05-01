package com.sunbeam;

public class Assignment9Q3 {
	

    public static int countWords(String str) {
        String[] words = str.split("\\s+");

        return words.length;
    }

	    public static void main(String[] args) {
	        String data = "The class String includes methods for examining individual characters of the sequence, " +
	                "for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string " +
	                "with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode " +
	                "Standard version specified by the Character class";

	        int wordCount = countWords(data);
	        
	        System.out.println("Number of words in the string: " + wordCount);
	    }

	  

}
