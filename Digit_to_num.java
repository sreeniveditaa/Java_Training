package new1;

import java.util.Scanner;

public class Digit_to_num {
	public static void convertNumIntoWord(String str) {
		String[] singleDigit = {
	            "zero", "one", "two", "three", "four", 
	            "five", "six", "seven", "eight", "nine"
	        };

	        String[] twoDigits = {
	            "ten", "eleven", "twelve", "thirteen", "fourteen", 
	            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	        };

	        String[] tensMultiple = {
	            "", "", "twenty", "thirty", "forty", 
	            "fifty", "sixty", "seventy", "eighty", "ninety"
	        };

	        String[] tensPower = {"hundred", "thousand"};

	        int len = str.length();

	        
	        if (len == 0) {
	            System.out.println("Empty string");
	            return;
	        }

	        
	        if (len == 1) {
	            System.out.println(singleDigit[str.charAt(0) - '0']);
	            return;
	        }

	        int index = 0;

	        while (index < str.length()) {
	            if (len >= 3) {
	                if (str.charAt(index) - '0' != 0) {
	                    System.out.print(singleDigit[str.charAt(index) - '0'] + " ");
	                    System.out.print(tensPower[len - 3] + " ");
	                }
	                len--;
	            } else {
	                int digit1 = str.charAt(index) - '0';
	                int digit2 = str.charAt(index + 1) - '0';

	                if (digit1 == 1) {
	                    
	                    System.out.println(twoDigits[digit2]);
	                } else {
	                    
	                    if (digit1 != 0) {
	                        System.out.print(tensMultiple[digit1] + " ");
	                    }
	                    // Handle ones
	                    if (digit2 != 0) {
	                        System.out.print(singleDigit[digit2]);
	                    }
	                }
	                return; 
	            }
	            index++;
	        }
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (up to 4 digits): ");
        String input = sc.nextLine();

        if (!input.matches("\\d{1,4}")) 
        {
            System.out.println("Invalid input. Enter only digits (up to 4 digits).");
        } else 
        {
            convertNumIntoWord(input);
        }

        sc.close();
    }


}
