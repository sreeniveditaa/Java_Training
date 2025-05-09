package new1;

public class exception {
	public static void main(String[] args) {
		int n1=25;
		int n2=5;
		int div = 0;
		try {
			div=n1/n2;
		} catch(ArithmeticException exception){
			System.out.println("Dont divide by zero");
		}finally {
			System.out.println("This will always run");
		}
		System.out.println(div);
	}

}
