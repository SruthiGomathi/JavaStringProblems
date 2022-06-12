/* Remove the words that are palindromes in a given sentence.

Examples
Input : He did a good deed
Output: He good

Input: malayalam is my mother tongue
Output : is my mother tongue */

package practiceProblems;

import java.util.Scanner;

public class RemovePalindromeWords {
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static boolean isPalindrome(String s) {
		return s.equals(reverseString(s))?true:false;
	}
	public static void main(String args[]) {
		System.out.println("Enter the sentence....");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		for(int i=0;i<words.length;i++) {
			if(!isPalindrome(words[i])) {
				System.out.print(words[i] + " ");
			}
		}
	}
}
