package array_string;

import java.util.ArrayList;

public class ReverseVowel {

	enum Vowels {
		a, e, i, o, u
	}

	private static boolean isVowel(char c) {

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		} else {
			return false;
		}
	}

	static String reverseVowels(String s) {

		StringBuilder sb = new StringBuilder();
		char[] charArr = s.toCharArray();
		ArrayList<Character> vowels = new ArrayList<>();

		for (int i = 0; i < charArr.length; i++) {
			if (isVowel(charArr[i])) {
				vowels.add(charArr[i]);
			}
		}

		int vowelCount = 0;
		int length = vowels.size();

		for (int i = 0; i < charArr.length; i++) {
			if (isVowel(charArr[i])) {
				sb.append(vowels.get(length - vowelCount - 1));
				vowelCount++;
			} else {
				sb.append(charArr[i]);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws InterruptedException {
		String s = "leetcode";
		System.out.println(reverseVowels(s));
		
		System.out.println("No of processors : " + Runtime.getRuntime().availableProcessors());
		System.out.println("Free Memory : " + Runtime.getRuntime().freeMemory());
		System.gc();
		Thread.sleep(1000);
		System.out.println("Free Memory : " + Runtime.getRuntime().freeMemory());
		System.out.println("Total Memory : " + Runtime.getRuntime().totalMemory());

	}
}
