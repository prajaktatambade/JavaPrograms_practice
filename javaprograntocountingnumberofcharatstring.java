import java.util.*;
public class javaprograntocountingnumberofcharatstring {
	/*public static void main(String args[]) 
	{
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!= " ")
			{
				count++;
			    if(string.charAt(i) != ' ')   
			}
		}
	}
	*/
	  public static void main(String[] args) {    
	        String string = "The best of both worldsss";    
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);    
	    }    
	}


