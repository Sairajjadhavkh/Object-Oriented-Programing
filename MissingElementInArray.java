package lab;

public class MissingElementInArray {
	public static void main(String args[])
	{
		int arr1[]= {1,3,4,5};
		int temp;
		for(int i=0;i<arr1.length+1;i++)
		{	
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j]) {
				temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
				}
			}
		}
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			count++;
			if(count!=arr1[i])
			{
				System.out.println(count+" is missing");
				break;
			}
			
		}
	}
}
			
