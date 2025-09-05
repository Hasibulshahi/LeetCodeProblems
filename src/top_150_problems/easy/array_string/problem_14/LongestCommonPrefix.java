package top_150_problems.easy.problem_14;

public class LongestCommonPrefix {
    public LongestCommonPrefix(){
        System.out.println("****************** 14. Longest Common Prefix *******************");
        String[] s = {"flower","flow","flight"};
        System.out.println(this.longestCommonPrefix(s));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix length until it matches the beginning of strs[i]
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
