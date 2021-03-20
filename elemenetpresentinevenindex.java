import java.util.*;
public class elemenetpresentinevenindex {
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
			int [] arr1=new int [10];
		
			System.out.println("enterarray elements");
			for(int i=0;i<10;i++)
			  {
				 arr1[i]=sc.nextInt();
			  }

			for(int i=1;i<arr1.length;i=i+2) {
				System.out.println(arr1[i]);
			}
			System.out.println("odd position no");
			for(int i=0;i<arr1.length;i=i+2) {
				System.out.println(arr1[i]);
			}
	}

}
