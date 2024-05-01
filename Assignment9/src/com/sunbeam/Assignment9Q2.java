package com.sunbeam;

public class Assignment9Q2 {

		  public static boolean isPalindrome(String str) {
		    int n = str.length();
		

		    for (int i = 0; i < n / 2; i++)
		    {
		      if (str.charAt(i) != str.charAt(n - i - 1))
		      {
		        return false;
		      }
		    }
		    return true;
		  }

		  public static void main(String[] args) {
		    String str = "Bhushan";
		    if (isPalindrome(str)) {
		      System.out.println(str + " is a palindrome");
		    } else {
		      System.out.println(str + " is not a palindrome");
		    }

		    str = "Hello";
		    if (isPalindrome(str)) {
		      System.out.println(str + " is a palindrome");
		    } else {
		      System.out.println(str + " is not a palindrome");
		    }
		  }
	
}
