package top_150_problems.easy.problem_392;

public class IsSubsequence {
    public IsSubsequence(){
        System.out.println("****************** 392. Is Subsequence *******************");
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(this.isSubsequence(s,t));
    }
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i<s.length() && j<t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}