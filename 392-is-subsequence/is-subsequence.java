class Solution {
    public boolean isSubsequence(String s, String t) {
        int sin = 0;
        int tin = 0;

        while (sin < s.length() && tin < t.length()) {
            if (s.charAt(sin) == t.charAt(tin)) {
                sin++;
            }
            tin++;
        }

        // If we have traversed all characters in s, it is a subsequence of t
        return sin == s.length();
    }
}
