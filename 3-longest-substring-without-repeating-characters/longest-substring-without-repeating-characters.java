import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();
        int maxl = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxl = Math.max(maxl, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxl;
    }
}
