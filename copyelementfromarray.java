import java.util.*;

public class copyelementfromarray {
	public static void main(String args[])
	{
		  Scanner sc=new Scanner(System.in);
		  int [] arr1 = new int [5];
		  int [] arr2 = new int [5];
		  System.out.println("ENter Array elemeners");
		  for(int i=0;i<5;i++)
		  {
			 arr1[i]=sc.nextInt();
		  }
		  for(int i=0;i<5;i++)
		  {
			  arr2[i]=arr1[i];
		  }
		  for(int i=0;i<5;i++)
		  {
			 System.out.println(arr1[i]+" ");
		  }
		  for(int i=0;i<5;i++)
		  {
			 System.out.println("array after copieng"+arr2[i]+" ");
		  }
		  
		  
		  
		  
		
	}

}
