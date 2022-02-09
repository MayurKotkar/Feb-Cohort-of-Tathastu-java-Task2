//WAP to print diamond pattern

public class Ex6 {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++)
		{
			if(i<6)
			{
				for(int j=5-i;j>0;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				for(int k=1;k<i-4;k++)
				{
					System.out.print(" ");
				}
				for(int j=10-i;j>=1;j--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}