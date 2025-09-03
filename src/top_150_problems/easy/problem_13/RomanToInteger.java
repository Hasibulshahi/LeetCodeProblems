package top_150_problems.easy.problem_13;

public class RomanToInteger {
    public RomanToInteger() {
        System.out.println("****************** 13. Roman to Integer *******************");
        String s = "DCXXI";
        System.out.println(this.romanToInt(s));
    }
    public int romanToInt(String s) {
        int sum = 0;
        int i=1,v=5,x=10,l=50,c=100,d=500,m=1000,iv=4,ix=9,cm=900,cd=400,xl=40,xc=90;
        char[] ch = s.toCharArray();
        int n = s.length();
        for (int j=0;j<n;j++){
            if (ch[j] == 'I') {
                if (j<n-1 && ch[j + 1] == 'V') {
                    sum = sum + iv;
                    j++;
                }
                else if (j<n-1 && ch[j + 1] == 'X') {
                    sum = sum + ix;
                    j++;
                }
                else {
                    sum = sum + i;
                }
            }
            else if (ch[j] == 'X') {
                if (j<n-1 && ch[j + 1] == 'L') {
                    sum = sum + xl;
                    j++;
                }
                else if (j<n-1 && ch[j + 1] == 'C') {
                    sum = sum + xc;
                    j++;
                }
                else {
                    sum = sum + x;
                }
            }
            else if (ch[j] == 'C') {
                if (j<n-1 && ch[j + 1] == 'D') {
                    sum = sum + cd;
                    j++;
                }
                else if (j<n-1 && ch[j + 1] == 'M') {
                    sum = sum + cm;
                    j++;
                }
                else {
                    sum = sum + c;
                }
            }
            else if (ch[j] == 'D') {
                sum = sum + d;
            }
            else if (ch[j] == 'V') {
                sum = sum + v;
            }
            else if (ch[j] == 'L') {
                sum = sum + l;
            }
            else if (ch[j] == 'M') {
                sum = sum + m;
            }
        }
        return sum;
    }
}