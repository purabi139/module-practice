
public class Selectionsort {
	
	public static int[] selectionsort(int [] array)
	{
		for(int i=0;i<=array.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[index])
				{
					index=j;
				}
			}
			
			int smallerNumber=array[index];
			array[index]=array[i];
			array[i]=smallerNumber;
		}
		return array;
		
	}

	public static void main(String[] args) {
		
		int [] array={-10,34,2,56,7,67,88,42};
		int[]array2=selectionsort(array);
		for(int i:array2)
		{
			System.out.print(i);
			System.out.print(" ,");
		}
	}

}
