package Strings_Assignments;

import java.util.Scanner;

public class Question_5 
{ 
	//Repeated Occuring Character
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		str = str.replace(" ", "");
		System.out.println(str);
		char carr[] = str.toCharArray();
		//System.out.println(carr);
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(carr[i]==carr[j])
				{
					System.out.println("Dublicate Characters are :-->  "+carr[j]);
					break;
				}
			}
		}
		
	}

}
