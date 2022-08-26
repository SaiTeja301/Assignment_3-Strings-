package Strings_Assignments;
import java.util.Scanner;

public class Question_4 
{
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replace(" ", "");
		str = str.toUpperCase();
		System.out.println(str);
		char x[] = str.toCharArray(); 
		int size = x.length;
		int arr[]= new int[26];
		int i=0;
		while(i!=size)
		{
			int index = x[i]-65;
			arr[index]=1;
			i++;
		}
		i = 0;
		while(i!=26)
		{
			if(arr[i]==1)
			{
				i++;
			}
			else
			{
				System.out.println("Not a Pangram");
				System.exit(0);
			}
		}
		System.out.println("it is a pangram");
	}
}
