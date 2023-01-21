package arrays;
import java.util.*;
public class RepeatedSalaryCount {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int size=0,count=0;
		int []array=new int[100];
		System.out.println("enter the length of the array..!");
		size=input.nextInt();
		if(size<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else{
			for(int index=0;index<size;index++) {
				System.out.println("Enter the salary: ");
				array[index]=input.nextInt();
				if(array[index]<0){
					System.out.println("Invalid input!please enter valid number...!");
					System.exit(0);
				}
			}
			for(int row=0;row<size;row++) {
				for(int col=0;col<size;col++){
					if(array[row]==array[col]){
						count++;
						for(int last=col;last<size;last++)
							array[last]=array[last+1];
						size--;
					}
					else
						//System.out.println("no salary is repeated..!");
						col++;
				}
			}
			System.out.println("count is: "+count);
			input.close();
		}
	}
}
