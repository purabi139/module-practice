
public class insertion_sort {
	
	public static int[] doinsertionsort(int [] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[j-1])
				{
					int temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		return array;
		
	}

	public static void main(String[] args) {
		int [] input={2,10,3,4,5,6};	
		int [] input1=doinsertionsort(input);
		for(int i:input1)
		{
			 System.out.print(i);
	            System.out.print(", ");
	//- See more at: http://www.java2novice.com/java-sorting-algorithms/insertion-sort/#sthash.vsKPZsmJ.dpuf
		}	

	}

}
