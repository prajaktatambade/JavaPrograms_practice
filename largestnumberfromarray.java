import java.util.*;
public class largestnumberfromarray {
  public static void main(String arg[])
  {
	  Scanner sc=new Scanner(System.in);
		int [] arr1=new int [5];
	
		System.out.println("enterarray elements");
		for(int i=0;i<5;i++)
		  {
			 arr1[i]=sc.nextInt();
		  }
		int max=arr1[0];
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max) {
				max=arr1[i];
			}
		}
		
		System.out.println("lagest element="+max);
		int min=arr1[0];
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<min) {
				min=arr1[i];
			}
		}
		System.out.println("smalest element="+min);
  }
}
