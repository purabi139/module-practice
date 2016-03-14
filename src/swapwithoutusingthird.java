
public class swapwithoutusingthird {
	
	public static void swapwithoutusing(int a,int b)
	{
		
		a=a+b;
		b=a-b;
		a=a-b;
	System.out.println(a+ " " +b);	
	}

	public static void main(String[] args) {
		
		swapwithoutusing(5,6);

	}

}
