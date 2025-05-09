package new1;

public class Recursion {
	public static void main(String[] args) {
		int [] a = {2,3,4,5,6};
		int n= a.length;
		int res= seqsum(a,n);
		System.out.println("sum: "+res);
		
	}
	public static int seqsum(int [] a , int n) {
		if(n<=0)
			return 0;
		
		return seqsum(a,n-1) + a[n-1];
	}
}
