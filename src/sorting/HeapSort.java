package sorting;

public class HeapSort {

	public static void main(String[] args) {
		int[] input = {9,5,8,10,4,2,56,87};
		DoHeapSort(input);
		print(input);
		
	}
	
	static void DoHeapSort(int[] input){
		int heapSize = input.length;
		for (int i = heapSize/2-1; i >= 0; i--) {
			MaxHeapify(input,heapSize, i);
		}
		
		for (int i = input.length - 1; i >= 0; i--)
	    {
	        //Swap
	        int temp = input[i];
	        input[i] = input[0];
	        input[0] = temp;
	 
	        heapSize--;
	        MaxHeapify(input,heapSize, 0);
	    }
	}

	private static void MaxHeapify(int[] input, int heapSize, int i) {
		int left = 2*i;
		int right = 2*i + 1;
		
		int largest = i;
		if(left < heapSize && input[left] > input[i]){
			largest = left;
		}
		
		if(right< heapSize && input[right] > input[largest]){
			largest = right;
		}
		
		if(largest != i){
			int temp = input[i];
			input[i] = input[largest];
			input[largest] = temp;
			
			MaxHeapify(input, heapSize, largest);
		}
	}

	public static void print(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}


}
