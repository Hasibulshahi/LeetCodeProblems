package leet_code_problems.problem_5;

import java.util.*;

public class LongestPalindromicSubstring {
    public LongestPalindromicSubstring() {
        System.out.println("***************** Longest Palindromic SubString ********************");
        System.out.println("With TLE: "+longestPalindromeTLE("babad"));
        System.out.println("Without TLE: "+longestPalindrome("babad"));
    }

    public String longestPalindromeTLE(String s) {
        String longest = "";  // store longest palindrome
        int maxLength = 0;    // track max length found

        if (!s.isEmpty() && s.length() <= 1000) {
            // Check all substrings to find the longest palindrome
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String sub = s.substring(i, j);
                    String reversed = new StringBuilder(sub).reverse().toString();

                    if (sub.equals(reversed) && sub.length() > maxLength) {
                        longest = sub;
                        maxLength = sub.length();
                    }
                }
            }

            if (!longest.isEmpty()) {
                System.out.println("Longest palindrome: " + longest + ", Length: " + maxLength);
            } else {
                System.out.println("No palindrome found.");
            }
        }
        return longest;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);     // odd-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // even-length palindrome
            int len = Math.max(len1, len2);

            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }
}
