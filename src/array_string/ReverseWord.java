package array_string;

/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. 
The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. 
Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
*/

public class ReverseWord {

//	private static String reverseWords(String s) {
//		String[] str = s.split(" ");
//		System.out.println(str.length);
//		ArrayList<String> strList = new ArrayList<>();
//		
//		for(String ss : str) {
//			System.out.println("|" + ss + "|");
//			if(!ss.equals(" ")) {
//				strList.add(ss);
//			}
//		}
//		
//		System.out.println("ArrayList size: " + strList.size());
//		
//		return "";
//	}

	private static String reverseWords(String s) {
		String[] words = s.trim().split("\\s+");
		StringBuilder reversedSentence = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			//System.out.println("Word: |" + words[i] + "|");
			//if (!words[i].equals(" ")) {
				reversedSentence.append(words[i].trim());
			//}
			if (i > 0) {
				reversedSentence.append(" ");
			}
		}
		return reversedSentence.toString();

	}

	public static void main(String[] args) {
		String s = "  hello    world    ";
		String reverse = reverseWords(s);
		System.out.println("Input: |" + s + "|");
		System.out.println("Reverse: |" + reverse + "|");
	}
}
