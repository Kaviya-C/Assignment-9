package arrays;
import java.util.Scanner;
public class MaximumSumArray 
{
	public static void main(String[] args) 
	{
		try(Scanner input=new Scanner(System.in))
		{
			int size=input.nextInt();
			if(size<0){
				System.out.println("Invalid array size");
				return;
			}
			int[]numbers=new int[size];
			for(int index=0;index<size;index++)
			{
				numbers[index]=input.nextInt();
				if(numbers[index]<0){
					System.out.println("Invalid input");
					return;
				}
			}
			System.out.println(maximumSum(numbers,size));				
		}			
	}
	public static int maximumSum(int[]numbers,int size) {
		int evenSum=0,oddSum=0;
		for(int index=0;index<size;index++) {
			if(numbers[index]%2==0){
				evenSum+=numbers[index];
			}
			else
				oddSum+=numbers[index];
		}
		return (oddSum>evenSum)?oddSum:evenSum;
	}
}
/*int sum=0,size=0;
		Scanner input=new Scanner(System.in);

		int []array=new int[50];

		System.out.println("enter the size of the array..!");
		size=input.nextInt();

		System.out.println("length "+array);

		if(size<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else {
			for(int index=0;index<size;index++) 
			{

				System.out.println("Enter the value: ");
				array[index]=input.nextInt();
			}
			for(int index=0;index<size;index++) 
			{
				if(array[index]>0) 
				{
					if(array[index]%2==0)
					{
						sum+=array[index];
					}

					else if(array[index]<0)
					{
						System.out.println("invalid number");
					}
				}
			}

		}
		System.out.println("sum of even values: "+sum);
		input.close();
	}

}*/
