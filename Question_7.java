package Strings_Assignments;

import java.util.Scanner;

public class Question_7
{
	public static void main(String args[])
	{
		System.out.print("Enter the String :--->");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		str = str.replace(" ", "");
		System.out.println(str);
		char arr[] = str.toCharArray();
		int size = arr.length;
		int vowels = 0;
		int constant = 0;
		int Special_char = 0;
		int i=0;
		while(i!=size)
		{
			if(arr[i]>='A'&& arr[i]<='Z')
			{
				if(arr[i]=='A'|| arr[i]=='E' || arr[i]=='I'|| arr[i]=='O'||arr[i]=='U')
				{
					vowels++;
				}
				else
				{
					constant++;
				}
			}
			else
			{
				Special_char++;
			}
			
			i++;
		}
		System.out.println("Number of Vowels are :-->"+vowels);
		System.out.println("Number of Constants are :-->"+constant);
		System.out.println("Number of Special Charcters are :-->"+Special_char);
	}
}
