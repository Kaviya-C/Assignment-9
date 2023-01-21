package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SumTwoArray {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int[]array1=new int[5];
		int [] array2=new int[5];
		for(int index=0;index<array1.length;index++)
		{
			System.out.print("enter the elements: "+" ");
			array1[index]=input.nextInt();	
		}
		for(int index=0;index<array1.length;index++) 
			System.out.println(array1[index]);
		for(int index=0;index<array2.length;index++)
		{
			System.out.print("enter the elements: "+" ");
			array2[index]=input.nextInt();	
		}
		int[] result=add(array1,array2);
		System.out.println("First array: "+Arrays.toString(array1));
		System.out.println("Second array: "+Arrays.toString(array2));
		System.out.println("Sum of Two arrays: "+Arrays.toString(result));
		input.close();
	}
	public static int[] add(int[] first,int[]second)
	{
		int length=first.length<second.length?first.length:second.length;
		int[] result=new int[length];
		for(int start=0;start<length;start++)
			result[start]=first[start]+second[start];
		return result;
	}
}
