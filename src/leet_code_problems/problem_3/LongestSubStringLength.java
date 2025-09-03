package leet_code_problems.problem_3;

import java.util.HashSet;

public class LongestSubStringLength {
    public LongestSubStringLength(){
        System.out.println("***************** Longest SubString Length ********************");
        System.out.println(this.lengthOfLongestSubstring("abcabcbb"));
    }
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character already exists, shrink the window from the left
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character and update max length
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        for (int i: set) {
            System.out.print(i);
        }

        return maxLength;
    }
}
