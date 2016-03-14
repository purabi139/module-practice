import org.omg.Messaging.SyncScopeHelper;

public class bubble_sort {
	
	//sort the array { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	//   // logic to sort the elements
	public static int[] bubble_sort(int array[])
	{
		int n=array.length;
		
		for(int m=n ; m>=0; m--)
		{
			int k;
			for(int i=0; i<n-1; i++)
			{
				k = i+1;
				if(array[i] > array[k])
				{
					//System.out.println("i : "+ i + " k : "+ k);
					swap(i, k, array);
				}
			}
		}
		
		return array;
	}
	
	public static void swap(int i,int j,int[] array)
	{
		//System.out.println("i : "+ i + " j : "+ j + " array "+ array);
		int temp;
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public static void printnumbers(int input[])
	{
		for(int i=0;i<input.length-1;i++)
		{
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		//int input[]={ 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int input[]={ 5,-1,2};
		int[] output = bubble_sort(input);
		printnumbers(output);

	}

}
