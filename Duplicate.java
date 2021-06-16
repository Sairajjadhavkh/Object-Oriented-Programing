package lab;

public class Duplicate {
	public static void main(String args[])
	{
		int arr[]= {1, 2, 3, 3, 4 , 6, 6};
		int temp;
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				count++;
				for(int j=0;j<count;j++)
				{
					System.out.println(arr[j]);
				}
			}
		}
		
	}
}

