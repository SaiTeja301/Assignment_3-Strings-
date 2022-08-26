package Strings_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Questions__6_With_Sorting_Method 
{
  public static void main(String args[])
  {
	  System.out.print("Enter the String : ");
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  str = str.replace(" ", "");
	  str = str.toLowerCase();
	  char ch[] = str.toCharArray();
	  Arrays.sort(ch);
	  System.out.println(ch);
  }
}
