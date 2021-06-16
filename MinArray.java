import java.util.Scanner;
class MinArray
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<=arr.length-1;i++)   //5 4 3 2 1
	{
	arr[i]=sc.nextInt();
	}
	int small=arr[0];
	for(int i=1;i<=4;i++)
	{
		if(arr[i]<small)
		small=arr[i];
	}
	System.out.println("minimum="+small);
	
}
}