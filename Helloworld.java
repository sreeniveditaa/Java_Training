package new1;

import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {
		System.out.println("enter the nums");
		Scanner ip = new Scanner(System.in);
		int m = ip.nextInt();
		int n = ip.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += m;
		}
		System.out.println(ans);
	}

}
