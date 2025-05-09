package new1;

public class GCD {
	public static void main(String[] args){
		int a =48;
		int b=18;
		int res=gcd(a,b);
		System.out.println(res);
		
	}

	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
}
