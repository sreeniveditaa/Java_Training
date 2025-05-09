package new1;

import java.util.Scanner;

public class arraysinc {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num1,num2=1,i,j;
		num1=ip.nextInt();
		for(i=1;i<=num1;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num2+" ");
				num2++;
			}
			System.out.println();
		}
		

	}

}
