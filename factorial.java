package new1;

public class factorial {
	public static void main(String[] args) {
		long a =5;
		long res = 1;
		for (int i = 1; i <= a; i++) {
			res = res * i;
		}
		System.out.println(res);
		int count=0;
		while(res%10==0) {
			count++;
			res=res/10;
		}
		System.out.println(count);
	}
}
