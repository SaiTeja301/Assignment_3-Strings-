package Strings_Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class Question_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First String to Check the Anagram are not :");
		String a = sc.nextLine();
		System.out.print("Enter the Secound String to Check the Anagram are not :");
		String b = sc.nextLine();
		/// Converting the String int array format
		a = a.replace(" ", ""); // to avoid the spaces "he is Good"
		b = b.replace(" ", ""); ////  like "heisGood"
		// converting in to one entity charater size
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		char x[] = a.toCharArray();
		char y[] = b.toCharArray();
		// converting in to Sorting arrangement
		Arrays.sort(x);
		Arrays.sort(y);
		// checking the result
		Boolean res = Arrays.equals(x,y);
		if(res==true)
		{
			System.out.println(a+" and "+b+" both are Anagram ");
		}
		else
		{
			System.out.println(a+" and "+b+" both are not an Anagram ");
		}
	}
}
