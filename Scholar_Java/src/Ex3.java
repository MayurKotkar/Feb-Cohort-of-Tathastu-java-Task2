//WAP to calculate factorial of number 

import java.util.Scanner;

public class Ex3 {
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find factorial : ");
		int n = sc.nextInt();
		System.out.println("factorial of "+n+" : "+factorial(n));
	}
}