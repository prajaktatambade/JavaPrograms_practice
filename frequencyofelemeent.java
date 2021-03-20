import java.util.*;

public class frequencyofelemeent {
	public static void main(String args[])
	{  
		 Scanner sc=new Scanner(System.in);
		System.out.println("ENter Array elemeners");
		 int [] arr1=new int[5];
		 int [] fr=new int [arr1.length];
		  for(int i=0;i<5;i++)
		  {
			 arr1[i]=sc.nextInt();
			 
		  }
		  int visited=-1;
		  for(int i=0;i<arr1.length;i++)
		  {
			  int count=1;
			  for(int j=i+1;j<arr1.length;j++)
			  {
				  if(arr1[i]==arr1[j])
				  {
					  count++;
					  fr[j]=visited;
				  }
			  }
			  if(fr[i]!=visited)
			  {
				  fr[i]=count;
				  
			  }
				  
		  }
		  for(int i=0;i<fr.length;i++)
		  {
			  if(fr[i] != visited)  
	                System.out.println("    " + arr1[i] + "    |    " + fr[i]);  
		  }
	}

}
