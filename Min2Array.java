import java.util.Scanner;
class Min2Array
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<5;i++)
	{
	arr[i]=sc.nextInt();
	}
	for(int i=0;i<5;i++)
	{
		int temp;
		int small=arr[i];
		for(int j=i+1;j<5;j++)
		{
		if(small<arr[j])
		{
		small=arr[j];
		}
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
	
	
	}
	for(int a:arr)
	{
		System.out.print(a+" ");
	}
	
}
}