package arrays;
import java.util.Scanner;
public class LowerCaseLetter {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the word: ");
		String word=input.next();
		StringBuffer sb=new StringBuffer();
		
		for(int start=0;start<word.length();start++)
		{
			if(Character.isLowerCase(word.charAt(start)))
				sb.append(word.charAt(start));
				
		}
		
		System.out.println("lower case letters are: "+sb);
		input.close();
		
	}

}
