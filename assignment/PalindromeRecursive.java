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
		  System.out.println(isPalindrome); 
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
	       String cleanupStr = s.replaceAll("[\\W]", "");   

	       cleanupStr = cleanupStr.toLowerCase();

	       System.out.println(cleanupStr);
	      
	       return cleanupStr; 
	    } 
	   
	   
 	   private static boolean checkPalindrome(String inputString, int low, int high) { 

               boolean tcheck = false;
	       if (low <= high){
		   StringBuilder inputstring2=new StringBuilder();
	 	   inputstring2.append(inputString);
	 	   String check=inputstring2.toString();
	 	   System.out.println(check);//debug track
	 	   char highChar = check.charAt(high);
	 	   char lowChar = check.charAt(low);
	 	   System.out.println("second mark");//  debug track
	 	   if (highChar == lowChar){
	     		tcheck = true;
		   }
		 }
	       else {
		checkPalindrome(inputString,(low + 1),(high - 1));
	       }
	       return tcheck;
	 
 } 
}  

