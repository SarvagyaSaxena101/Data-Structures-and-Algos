package recursion_practice;

public class subsequence {
    public static void subs(String str, int idx, String ans){
        if (idx == str.length()) {
            System.out.println(ans + " ");
            return;
        }
        subs(str, idx+1, ans+str.charAt(idx));
        subs(str, idx+1, ans);
    }
    public static void main(String[] args) {
        subs("abc", 0, "");
    }
}