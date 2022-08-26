package Strings_Assignments;
import java.util.Scanner;

public class Question_1 
{
  public static void main(String args[])
  {
	  /// By using String Buffer
	  System.out.println("Enter the String");
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  StringBuffer bf = new StringBuffer(str);
	  StringBuffer str1 = bf.reverse();
	  System.out.println(str1);
	  
  }
}
