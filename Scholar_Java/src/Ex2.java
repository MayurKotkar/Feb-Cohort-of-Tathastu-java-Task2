//WAP to calculate fibonacci series up to n numbers

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want in fibonacci series");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.print("0\t1\t");
		while(n>2)
		{
			c = a+b;
			System.out.print(c+"\t");
			a = b;
			b = c;
			n--;
		}
	}
}