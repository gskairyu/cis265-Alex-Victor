import java.util.Scanner; 
public class Palindrome { 
  public static void main(String [] args)  
{ 
  System.out.print("Enter a String to check if it is a palindrome : "); 
  Scanner input = new Scanner(System.in); 
  String palindromeStr = input.nextLine(); 
         boolean palindrome = isPalindrome(palindromeStr);      
         if(palindrome)  
          System.out.println(palindromeStr + " is a palindrome."); 

 
 
else  
          System.out.println(palindromeStr + " is not a palindrome."); 
         
         
     input.close();    
    } 
 
    public static boolean isPalindrome(String palindromeStr) 
    { 
    	
    	
        boolean result = false; 
        String check="";
        char[] convert=palindromeStr.toCharArray();
        
        	for (int i=(palindromeStr.length()-1); i>-1;i--) {
        		
        		check+=convert[i];
        	}
        	if (palindromeStr.equals(check)) {
        		
        		result=true;
        	}
        
        return result; 
    } 
} 