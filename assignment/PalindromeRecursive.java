/*public class PalindromeRecursive {
	
	/*public static void main(String args[]){  
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString=s1.replaceAll("\\s",""); 
		String s2=replaceString.replaceAll("\\. e","");
		System.out.println(s2);  
		}}
	*/
import java.util.Scanner; 

public class PalindromeRecursive { 

	  public static void main(String[] args) 
	  { 
		  System.out.print("Enter a string to check if it is palindrome :: ");
 
		  Scanner input = new Scanner(System.in); 

		  String inputString = input.nextLine();
 
		  String palindromeString = cleanupString(inputString); 

		  boolean isPalindrome = checkPalindrome(palindromeString, 0, palindromeString.length()-1);

		  if (isPalindrome) { 

		   System.out.println("The given string is a palindrome"); 

		  } 

		  else { 

		   System.out.println("The given string is not a palindrome"); 

		  }
		  
		  input.close(); 
	  }
	  
	  
 /* Creating a method for performing string clean operation to get rid of unwanted characters */ 
	   private static String cleanupString(String s) 
	   {
	       // replaceAll removes all special characters and spaces.
	       String cleanupStr = s.replaceAll("[\\W]", "");
	       // toLowerCase used to make the string a lowercase value.
	       cleanupStr = cleanupStr.toLowerCase();
	      
	       return cleanupStr; 
	    } 


	   
 	   private static boolean checkPalindrome(String inputString, int low, int high) { 
		
		// Takes the character at the last position and sets it to a variable.
	        char highChar = inputString.charAt(high);
		// Takes the character at the first position and sets it to a variable.
	        char lowChar = inputString.charAt(low);
		// Checks to see if the string has recursively gone through all possible characters and if so, returns true.
	        if (low > high){
	           return true;
                }
		// Recursively calls the method to check the next lowest if they are equivalent.
	        if (highChar == lowChar){
	           return checkPalindrome(inputString,(low + 1),(high - 1));
	        }
		// Returns false when they are not equivilant and the value of low does not exceed the value of high.	 
	        return false;
 } 
}  
