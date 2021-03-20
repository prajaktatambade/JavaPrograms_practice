import java.util.*;

public class arrayleftrotate {
	public static void main(String args[])
	{	  Scanner sc=new Scanner(System.in);
		int [] arr1=new int [5];
		int [] arr2 = new int [5];
		System.out.println("enterarray elements");
		for(int i=0;i<5;i++)
		  {
			 arr1[i]=sc.nextInt();
		  }
		  int n=1,j;
		  for(int i=0;i<n;i++)
		  {
			  int first=arr1[0];
		  for(j=0;j<arr1.length-1;j++)
		  {
			 
			  arr1[j]=arr1[j+1];
			  
			  
		  }
		  arr1[j]=first;
		  }
		  for(int i=0;i<5;i++)
		  {
			 System.out.println("array after copieng"+arr1[i]+" ");
		  }
		  
	}

}
