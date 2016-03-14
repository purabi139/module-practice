
public class insertionsort1 {
	
	public static int[]  insertionsort1(int []arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=i;
			for(key=1;key<arr.length;key++)
			{
				if(arr[key-1]>arr[key])
				{
					swap(key,key-1,arr);
					//key--;
					
				}
			}
			
		}
		return arr;
		
	}
	public static void swap(int key,int i,int []arr)
	{
		int temp;
		temp=arr[key];
		arr[key]=arr[i];
		arr[i]=temp;
	}
	
	public static void printnumbers(int input[])
	{
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		
		int input[]={ 5,-7,-1,2,0,78,-67,8,10,-3};
		int[] output = insertionsort1(input);
		printnumbers(output);

	}
	

	

}
