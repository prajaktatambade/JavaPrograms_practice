import java.util.*;
public class countingnumberofdigit {
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
		
	
			System.out.println("Enter the numbers");
			int num=sc.nextInt();
			int count=0;
			while(num!=0)
			{
				num=num/10;
				++count;
				
			}
			System.out.println("number of elements in array="+count);
	}

}
