package top_150_problems.easy.problem_125;

import java.util.Arrays;
import java.util.stream.Stream;

public class ValidPalindrome {
    public ValidPalindrome() {
        System.out.println("****************** 125. Valid Palindrome *******************");
        String s = "0P";
        System.out.println(this.isPalindromeWithoutTwoPointer(s));
        System.out.println(this.isPalindromeWithTwoPointer(s));
    }
    public boolean isPalindromeWithoutTwoPointer(String s) {
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        char[] str = new char[s.length()];
        int idx = 0;
        for (int i=0;i<ch.length;i++){
            if (ch[i] >= 'a' && ch[i] <= 'z' && ch[i] != ' ' || ch[i] >= '0' && ch[i] <='9'){
                str[idx++] = ch[i];
            }
        }
        char[] result = Arrays.copyOf(str, idx);
        String cleanString = new String(result);
        String revStr = new StringBuilder(cleanString).reverse().toString();
        System.out.println(cleanString+" -> "+revStr);
        return cleanString.equals(revStr);
    }

    public boolean isPalindromeWithTwoPointer(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphabetic characters
            while (left < right && !(s.charAt(left) >= 'a' && s.charAt(left) <= 'z' || s.charAt(left) >= '0' && s.charAt(left) <='9')) {
                left++;
            }
            while (left < right && !(s.charAt(right) >= 'a' && s.charAt(right) <= 'z' || s.charAt(left) >= '0' && s.charAt(left) <='9')) {
                right--;
            }

            // Compare characters
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
