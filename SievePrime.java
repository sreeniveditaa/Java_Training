package new1;

import java.util.Scanner;

public class SievePrime {
	public static void main(String[] args) {
		System.out.println("Enter the range ");
		Scanner ip = new Scanner(System.in);
		int input = ip.nextInt();
		boolean[] PrimesArray = new boolean[input];
		for(int i=0;i<PrimesArray.length;i++) {
			PrimesArray[i]=true;
		}
		for(int i=2;i*i<PrimesArray.length;i++) {
			if(PrimesArray[i]) {
				for(int j=i*i;j<PrimesArray.length;j=j+i) {
					PrimesArray[i]=false;
				}
			}
		}
		for(int i=0;i<PrimesArray.length;i++)
		{
			if(PrimesArray[i]) {
				System.out.println(i);
			}
		}
	}
}
