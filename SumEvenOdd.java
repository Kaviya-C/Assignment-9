package arrays;
import java.util.Scanner;
public class SumEvenOdd {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size: ");
		int n=input.nextInt();
		
		int array[]=new int[n];
		
		for(int index=0;index<array.length;index++) 
		{
		System.out.println("enter the elements: ");
		array[index]=input.nextInt();
		}
		
		int sumEven=0,sumOdd=0;
		
		for(int index=0;index<array.length;index++) 
		{
			if(array[index] % 2==0)
				sumEven+=array[index];
			else
				sumOdd+=array[index];
		}
		System.out.println("even values: "+sumEven);
		System.out.println("odd values: "+sumOdd);
		input.close();
	}
	

}
