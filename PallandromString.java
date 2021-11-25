package tanzeerdemo;
import java.util.*;
public class PallandromString {
	  
	   public static void main(String args[])  
	   {  
	      String o,
	      rev = ""; 
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      o = in.nextLine();   
	      int l = o.length(); 
	     
	      for ( int i = l - 1; i >= 0; i-- )  
	         rev = rev + o.charAt(i);
	      if (o.equals(rev))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }  
	}  

