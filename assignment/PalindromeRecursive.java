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
	      
	       return cleanupStr; 
	    } 
	   
	   
 private static boolean checkPalindrome(String inputString, int low, int high) { 
	 
	
	 StringBuilder inputstring2=new StringBuilder();
	 inputstring2.append(inputString);
	 inputstring2= inputstring2.reverse();
	 String check=inputstring2.toString();
	 System.out.println(check);//debug track
	 int i=high;
	 char ac=check.charAt(i);
	 String a=String.valueOf(ac);
	 char ab=check.charAt(i);
	 String b=String.valueOf(ab);
	 boolean tcheck=false;
	 System.out.println("second mark");//  debug track
	 if(a.equalsIgnoreCase(b)){
		 System.out.println(i);//debug track
		 if(i==0) {
			 
			 
			
	     		tcheck= true;
	     		 return tcheck;
			
		 }
		 else {
			 checkPalindrome(inputString,low,high-1);
		 }
	
	 }
	 
	 
		 return tcheck;
	 
 } 
}  

