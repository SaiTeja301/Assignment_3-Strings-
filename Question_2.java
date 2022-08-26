package Strings_Assignments;

import java.util.Scanner;

public class Question_2 
{
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1 = str1+str.charAt(i);
		}
	   
	    str1 = str1.toLowerCase();
	    String arr[]= str1.split(" ");
	    String str2 = "";
	    for(int i=arr.length-1;i>=0;i--)
	    {
		   str2 = str2+arr[i]+" ";
	    }
	    System.out.println(str2);
	}
}
