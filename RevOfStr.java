package new1;

public class RevOfStr {
	public static void main(String[] args) {
		String s = "niveditaa";
		System.out.println(rev(s));
	}

	public static String rev(String s) {
		if (s.length()==0){
			return s;
		};
		return rev(s.substring(1))+ s.charAt(0);
	}
}
