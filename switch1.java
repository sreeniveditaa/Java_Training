package new1;

import java.util.Scanner;

public class switch1 {
	static void add(int b , int c) {
		System.out.println(b+c);
	}
	static void sub(int b , int c) {
		System.out.println(b-c);
	}
	static void mul(int b , int c) {
		System.out.println(b*c);
	}
	static void div(int b , int c) {
		System.out.println(b/c);
	}
	public static void main(String[] args) {
		System.out.println("Select from 1. add 2. sub 3. mul 4. div 5. quit");
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		int b = ip.nextInt();
		int c = ip.nextInt();
		
			switch(a) {
			case 1:
				add(b,c);
				break;
			case 2:
				sub(b,c);
				break;
			case 3:
				mul(b,c);
				break;
			case 4:
				div(b,c);
				break;
			
			}
	}
}