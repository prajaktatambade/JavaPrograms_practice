import java.util.*;
public class printdupicatefromarray {
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
 		int [] arr1=new int [5];
	
 		System.out.println("enterarray elements");
 		for(int i=0;i<5;i++)
 		  {
 			 arr1[i]=sc.nextInt();
 		  }
 		  System.out.println("duplicate element");
 		  for(int i=0;i<arr1.length;i++)
 		  {
 			  for(int j=i+1;j<arr1.length;j++)
 			  {
 				  if(arr1[i]==arr1[j])
 				  System.out.println(arr1[j]);
 			  }
 		  }
     }
}
