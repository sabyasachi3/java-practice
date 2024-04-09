package array_string;

/*
 
 For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t 
 (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: "" 
 */





public class GCDOfString {

	public static String calculateGCDOfStrings(String str1, String str2) {


		if (!(str1 + str2).equals(str2 + str1)) {			
			return "";
		} else {
			System.out.println(str1.length() + " " + str2.length());
			int gcd = calculateGCD(str1.length(), str2.length());
			return str2.substring(0, gcd);
		}
	}

	private static int calculateGCD(int a, int b) {

		int gcd = 1;
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		else {
			for (int i = 1; i <= b; i++) {
				if (a % i == 0 && b % i == 0) {
					gcd = i;
				}
			}
			System.out.println("Returning GCD : " + gcd);
			return gcd;
		}
	}

	public static void main(String[] args) {
		//System.out.println("GCD : " + calculateGCD(12, 8));
		String str1 = "ABABAB";
		String str2 = "ABAB";
		System.out.println("GCD of String: " + calculateGCDOfStrings(str1, str2));
	
	
	}
}
