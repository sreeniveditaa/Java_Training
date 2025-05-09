package new1;

import java.util.HashMap;

public class Strings {
	public static void main(String[] args) {
		String input = "pwwkew";
		int max=0;
		int left=0;
		int start=0;
		HashMap<Character,Integer> position = new HashMap<>();
		for(int right=0;right<input.length();right++) {
			char curr = input.charAt(right);
			if(!position.containsKey(curr)) {
				position.put(curr, right);
			}
			else {
				left=Math.max(left, position.get(curr)+1);
				position.put(curr, right);
			}
			max=Math.max(max, (right-left)+1);
			start=left;
		}
	    String longSUb=input.substring(start, start+ max);
		System.out.println("max is: "+max);
		System.out.println(longSUb);
	}

}
