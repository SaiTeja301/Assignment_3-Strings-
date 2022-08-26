package Strings_Assignments;

import java.util.Scanner;

public class Question_6_Without_SortMEthod 
{
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		str = str.replace(" ","");
		char carr[] = str.toCharArray();
		char temp;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(carr[i]>carr[j])
				{
					temp    = carr[i];
				    carr[i] = carr[j];
				    carr[j] = temp;
				}
			}
		}
		System.out.println(new String(carr));
	}
}
