
public class selectionsort_1 {
	
	public static int[] selectionsort1(int []arr)
	{
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int smallerNumb=arr[index];
			arr[index]=arr[i];
			arr[i]=smallerNumb;
		}
		
		return arr;
		
	}

	public static void main(String[] args) {

		int [] array={-10,34,2,56,7,67,88,42};
		int[]array2=selectionsort1(array);
		for(int i:array2)
		{
			System.out.print(i);
			System.out.print(" ,");
		}
		

	}

}
