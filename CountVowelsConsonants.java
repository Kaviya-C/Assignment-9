package arrays;
import java.util.Scanner;
public class CountVowelsConsonants {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int vowelCount=0,consonantCount=0,digitCount=0;
		System.out.println("Enter the sentences: ");
		String sentence=input.nextLine();
		sentence=sentence.toLowerCase();
		for(int index=0;index<sentence.length();index++){
			char ch=sentence.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowelCount++;
			else if(ch>='0'&& ch<='9')
				digitCount++;
			else if(ch>='a'&& ch<='z')
				consonantCount++;
		}
		System.out.println("number of vowels: "+vowelCount);
		System.out.println("number of consonants: "+consonantCount);
		System.out.println("number of digits: "+digitCount);
		input.close();
	}
}
