import java.util.*;
public class arrayrotateright {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int [] arr1=new int [5];
	
		System.out.println("enterarray elements");
		for(int i=0;i<5;i++)
		  {
			 arr1[i]=sc.nextInt();
		  }
		int n=3;
		
		for(int i=0;i<n;i++)
		{
			int j,last;
			last=arr1.length-1;
			for(j=arr1.length-1;i>=0;i--)
			{
				arr1[i]=arr1[j];
			}
			arr1[0]=last;
		}
		   System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr1.length-1; i++){    
	            System.out.print(arr1[i] + " ");    
	}

}
}