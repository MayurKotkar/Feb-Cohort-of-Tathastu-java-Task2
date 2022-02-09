//WAP to find out whether given string is palindrome or not

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String to check palindrome or not");
		String str = sc.next();
		boolean flag = true;
		int i,j;
		
		for(i=0,j=str.length()-1;i<j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Given string is PALINDROME");
		else
			System.out.println("Given string NOT is palindrome");
	}
}