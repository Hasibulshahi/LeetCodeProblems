package top_150_problems.easy.problem_58;

import java.util.HashMap;

public class LengthOfLastWord {
    public LengthOfLastWord() {
        System.out.println("****************** 58. Length of Last Word *******************");
        String s = "luffy is still joyboy";
        System.out.println(this.lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();
        System.out.println(s);
        char[] ch = s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (ch[i] != ' '){
                length++;
            }
            else {
                length = 0;
            }
        }
        return length;
    }
}
