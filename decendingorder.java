import java.util.*;

public class decendingorder {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
		int [] arr1=new int [5];
	
		System.out.println("enterarray elements");
		for(int i=0;i<5;i++)
		  {
			 arr1[i]=sc.nextInt();
		  }
		int temp;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
					
				}
			}
		}
		 System.out.println("Array in decending order......");
         for(int i=0;i<5;i++)
		  {
			 System.out.println(arr1[i]+" ");
		  }
   }
   
}
