package Strings_Assignments;
import java.util.*;
public class Question_8 
{
	public static void main(String args[])
	{
		System.out.print("Enter the String :--->");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replace(" ", "");
		str =str.toLowerCase();
		System.out.println(str);
		char carr[] = str.toCharArray();
		int constants=0;
		int Special_Char=0;
		for(int i=0;i<str.length();i++)
		{
			if(carr[i]>='a'&& carr[i]<='z')
			{
				constants++;
			}
			else
			{
				Special_Char++;
			}
		}
		System.out.println(" The no of Constants are  :-->"+constants);
		System.out.println("The no of Special Charcters are  :-->"+Special_Char);
	}
}
