//WAP to check whether given array is mirror-inverse or not
// for ex : {3,4,2,0,1} is mirror-inverse

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want in array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		boolean flag = true;
		
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]]!=i)
				flag = false;
		}
		
		if(flag)
			System.out.println("given array is mirror-inverse");
		else
			System.out.println("given array is NOT mirror-inverse");
	}
}