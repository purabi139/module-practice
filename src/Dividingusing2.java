import java.util.Scanner;

public class Dividingusing2 {
//How to divide a number by 2 without using / operator ? 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int result=num;
		while(result>=2)
		{
			result=result-2;
		}
		
		if(result==0 && num!=0)
		{
			System.out.println("it is even" +num);
		}
		else if(result==1)
		{
			System.out.println("it is odd"  +num);
		}
		else
		{
			System.out.println("Not a valid inpput");
		}
		
	}

}
