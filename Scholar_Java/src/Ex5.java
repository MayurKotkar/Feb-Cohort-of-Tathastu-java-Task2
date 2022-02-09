//WAP to find permutation and combination of 2 numbers

import java.util.Scanner;

public class Ex5 {
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = sc.nextInt();
		System.out.print("Enter value of r : ");
		int r = sc.nextInt();
		
		int nf = factorial(n);
		int rf = factorial(r);
		int nrf = factorial(n-r);
		
		int p = nf/nrf;
		int c = nf/(nrf*rf);
		
		System.out.println(n+"P"+r+" : "+p);
		System.out.println(n+"C"+r+" : "+c);
	}
}