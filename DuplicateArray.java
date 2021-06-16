import java.util.Scanner;
class DupicateArray
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<=arr.length-1;i++)
	{
	arr[i]=sc.nextInt();
	}
	for(int i=0;i<=4;i++)
	{
		int large=arr[i];
		for(int j=i+1;j<=4;j++)
		{
			if(large==arr[j])
			System.out.println(large+"Duplicate number");
		}
	}
	
	
}
}