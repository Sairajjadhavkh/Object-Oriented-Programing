import java.util.Scanner;
class MaxArray
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<=arr.length-1;i++)
	{
	arr[i]=sc.nextInt();
	}
	int large=arr[0];
	for(int i=1;i<=4;i++)
	{
		if(arr[i]>large)
		large=arr[i];
	}
	System.out.println("minimum="+large);
	
}
}