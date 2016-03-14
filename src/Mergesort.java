import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mergesort {

	
	public static int[] Merge(int a[], int lowerBound, int middle, int upperBound) {
		int size=a.length;
		int [] temp=new int[size];
		for(int i=lowerBound;i<=upperBound;i++)
		{
			temp[i]=a[i];
		}
		int i=lowerBound;
		int j=middle+1;
		int k=lowerBound;
		while(i<=middle && j<=upperBound)
		{
			if(temp[i]<=temp[j])
			{
				a[k]=temp[i];
				i++;
			}
			else
			{
				a[k]=temp[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			a[k]=temp[i];
			k++;
			i++;
		}
		return a;
		
			

		}
		

	
	
	public static void MergeSort(int[] a, int lowerBound, int upperBound){
		
		int size=a.length;
		if(lowerBound<upperBound){
			
			int middle = (lowerBound + upperBound)/2;
			
			MergeSort(a,lowerBound,middle);
			MergeSort(a,middle+1, upperBound);
			
			Merge(a,lowerBound, middle, upperBound);
		}
	}
		


	

	public static void printnumbers(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int input[] = { 5, 1, 6, 2, 4, 3 };
		MergeSort(input, 0,  input.length - 1);
		printnumbers(input);
	}

}
