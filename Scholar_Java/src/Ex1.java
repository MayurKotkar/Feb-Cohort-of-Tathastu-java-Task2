//WAP to perform basic calculator operations

import java.util.Scanner; 

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("--------Calculator---------");
		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int n2 = sc.nextInt();
		
		do
		{
			System.out.println("---------Operations--------");
			System.out.println("1-Addition\n2-Substraction\n3-Multiplication\n4-Division");
			System.out.println("---------------------------");
			System.out.println("Enter your choice...");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Addition of "+n1+" and "+n2+" : "+(n1+n2));
					break;
				case 2:
					System.out.println("Substraction of "+n1+" and "+n2+" : "+(n1-n2));
					break;
				case 3:
					System.out.println("Multiplication of "+n1+" and "+n2+" : "+(n1*n2));
					break;
				case 4:
					if(n2!=0)
						System.out.println("Division of "+n1+" and "+n2+" : "+(n1/n2));
					else
						System.out.println("Cannot divide by 0");
					break;
				default:System.out.println("INVALID CHOICE");
			}
			System.out.println("Do you want to continue press 1");
		}while(sc.nextInt()==1);
		System.out.println("---------THANK YOU----------");
	}
}