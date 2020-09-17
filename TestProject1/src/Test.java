import java.util.Scanner;

public class Test 
{
 static void application(int[] q) 
 {
	 int count=0;
	
	
	for(int i=q.length-1;i>=0;i--)
	{
		if(q[i]!=i+1)
		{
			if(q[i-1]==i+1)
			{
				count++;
				int temp=0;
				temp=q[i-1];
				q[i-1]=q[i];
				q[i]=temp;
			}
			else if(q[i-2]==i+1)
			{
				count+=2;
				int temp=0;
				temp=q[i-2];
				q[i-2]=q[i-1];
				q[i-1]=temp;
				
				int temp1=0;
				temp1=q[i-1];
				q[i-1]=q[i];
				q[i]=temp1;
				
			}
			else
			{
				System.out.println("to catchoch");
				return;
			}
			
		}
		
	}

	
	System.out.println(count);
	
 }
	 private static final Scanner S = new Scanner(System.in);
 
 public static void main(String[] args) 
 {
	 System.out.println("Enter");
		int a=S.nextInt();
		for(int j=1;j<=a;j++)
		{
			System.out.println("Enter the size");
			int size=S.nextInt();
			int q[]=new int[size];
			System.out.println("Enter the elements");
			for(int k=0;k<q.length;k++)
			{
				q[k]=S.nextInt();
			}
			application(q);
}
 }
}





	
	
	
	



